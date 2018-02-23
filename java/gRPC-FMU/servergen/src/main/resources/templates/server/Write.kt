
        /**
         * Autogenerated method
         */
        override fun write{{varName}} (req: {{protoFile}}.{{dataType}}Write, responseObserver: StreamObserver<FmiDefinitions.Status> ) {

            val fmuId = req.fmuId
            val fmu = fmus[fmuId]
            if (fmu != null) {
                val status = fmu.variableAccessor.write{{typeName}}({{valueReference}}, req.value)
                statusReply(status, responseObserver)
            } else {
                LOG.warn("No FMU with id: {}", fmuId);
                statusReply(FmiStatus.Fatal, responseObserver)
            }

        }