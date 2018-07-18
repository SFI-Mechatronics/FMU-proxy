/*
 * The MIT License
 *
 * Copyright 2017-2018 Norwegian University of Technology
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

#ifndef FMU_PROXY_REMOTEFMUINSTANCE_HPP
#define FMU_PROXY_REMOTEFMUINSTANCE_HPP

#include <iostream>
#include <fmilib.h>
#include "../common/FmuService.h"
#include "../../fmi/FmiSimulation.hpp"

using namespace fmuproxy::thrift;

namespace fmuproxy::thrift::client {

    class RemoteFmuInstance: public fmuproxy::fmi::FmiSimulation {

    private:
        
        const FmuId fmu_id;
        double current_time;

        FmuServiceClient &client;
        fmuproxy::fmi::ModelDescription &modelDescription;

        StepResult stepResult;
        
        IntegerRead integerRead;
        BulkIntegerRead bulkIntegerRead;
        
        RealRead realRead;
        BulkRealRead bulkRealRead;
        
        StringRead stringRead;
        BulkStringRead bulkStringRead; 
        
        BooleanRead booleanRead;
        BulkBooleanRead bulkBooleanRead;
        
       
    public:
        RemoteFmuInstance(const FmuId fmu_id, FmuServiceClient &client, fmuproxy::fmi::ModelDescription &modelDescription);

        double getCurrentTime() const override;

        fmuproxy::fmi::ModelDescription &getModelDescription() const override;

        void init() override;

        void init(const double start) override;

        void init(const double start, const double stop) override;

        fmi2_status_t step(const double step_size) override;

        fmi2_status_t terminate() override;

        fmi2_status_t reset() override;

        fmi2_status_t readInteger(const fmi2_value_reference_t vr, fmi2_integer_t &ref) override;
        fmi2_status_t readInteger(const std::vector<fmi2_value_reference_t> &vr, std::vector<fmi2_integer_t> &ref) override;
        fmi2_status_t writeInteger(const fmi2_value_reference_t vr, const fmi2_integer_t value) override;
        fmi2_status_t writeInteger(const std::vector<fmi2_value_reference_t> &vr, const std::vector<fmi2_integer_t> &value) override;

        fmi2_status_t readReal(const fmi2_value_reference_t vr, fmi2_real_t &ref) override;
        fmi2_status_t readReal(const std::vector<fmi2_value_reference_t> &vr, std::vector<fmi2_real_t> &ref) override;
        fmi2_status_t writeReal(const fmi2_value_reference_t vr, const fmi2_real_t value) override;
        fmi2_status_t writeReal(const std::vector<fmi2_value_reference_t> &vr, const std::vector<fmi2_real_t> &value) override;

        fmi2_status_t readString(const fmi2_value_reference_t vr, fmi2_string_t &ref) override;
        fmi2_status_t readString(const std::vector<fmi2_value_reference_t> &vr, std::vector<fmi2_string_t> &ref) override;
        fmi2_status_t writeString(const fmi2_value_reference_t vr, const fmi2_string_t value) override;
        fmi2_status_t writeString(const std::vector<fmi2_value_reference_t> &vr, const std::vector<fmi2_string_t> &value) override;

        fmi2_status_t readBoolean(const fmi2_value_reference_t vr, fmi2_boolean_t &ref) override;
        fmi2_status_t readBoolean(const std::vector<fmi2_value_reference_t> &vr, std::vector<fmi2_boolean_t> &ref) override;
        fmi2_status_t writeBoolean(const fmi2_value_reference_t vr, const fmi2_boolean_t value) override;
        fmi2_status_t writeBoolean(const std::vector<fmi2_value_reference_t> &vr, const std::vector<fmi2_boolean_t> &value) override;

        ~RemoteFmuInstance() {
            std::cout << "RemoteFmuInstance destructor called" << std::endl;
        }

    };

}

#endif //FMU_PROXY_REMOTEFMUINSTANCE_HPP