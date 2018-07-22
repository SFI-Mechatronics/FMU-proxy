package no.mechatronics.sfi.fmuproxy.thrift

import no.mechatronics.sfi.fmi4j.common.FmiStatus
import no.mechatronics.sfi.fmi4j.importer.Fmu
import no.mechatronics.sfi.fmi4j.modeldescription.CommonModelDescription
import no.mechatronics.sfi.fmuproxy.Solver
import no.mechatronics.sfi.fmuproxy.TestUtils
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable
import org.junit.jupiter.api.condition.EnabledOnOs
import org.junit.jupiter.api.condition.OS
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File

@EnabledOnOs(OS.WINDOWS)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@EnabledIfEnvironmentVariable(named = "TEST_FMUs", matches = ".*")
class TestThriftME {

    private companion object {
        private val LOG: Logger = LoggerFactory.getLogger(TestThriftME::class.java)
    }

    private val fmu = Fmu.from(File(TestUtils.getTEST_FMUs(),
    "FMI_2.0/ModelExchange/win64/FMUSDK/2.0.4/vanDerPol/vanDerPol.fmu"))
    private val modelDescription: CommonModelDescription = fmu.modelDescription
    private val server: ThriftFmuServer = ThriftFmuServer(fmu)
    private val client: ThriftFmuClient = ThriftFmuClient("127.0.0.1", server.start())

    @AfterAll
    fun tearDown() {
        client.close()
        server.close()
        fmu.close()
    }

    @Test
    fun testModelName() {
        val modelName = client.modelDescription.modelName.also { LOG.info("modelName=$it") }
        Assertions.assertEquals(modelDescription.modelName, modelName)
    }

    @Test
    fun testGuid() {
        val guid = client.modelDescription.guid.also { LOG.info("guid=$it") }
        Assertions.assertEquals(modelDescription.guid, guid)
    }

    @Test
    fun testInstance() {

        val solver = Solver("Euler").apply {
            addProperty("step_size", modelDescription.defaultExperiment?.stepSize ?: 1E-3)
        }

        client.newInstance(solver).use { instance ->

            instance.init()
            Assertions.assertEquals(FmiStatus.OK, instance.lastStatus)

            val variableName = "x0"
            val variable = instance.getVariableByName(variableName).asRealVariable()

            variable.read().also {
                LOG.info("$variableName=${it.value}")
                Assertions.assertEquals(2.0, it.value)
            }

            val stop = 2.0
            val stepSize = 1E-2
            while (instance.currentTime < stop) {
                val step = instance.doStep(stepSize)
                Assertions.assertTrue(step)

                LOG.info("$variableName=${variable.read()}")

            }

        }

    }

}