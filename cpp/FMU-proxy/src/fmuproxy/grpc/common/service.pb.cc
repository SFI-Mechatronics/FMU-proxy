// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

#include <fmuproxy/grpc/common/service.pb.h>

#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// This is a temporary google only hack
#ifdef GOOGLE_PROTOBUF_ENFORCE_UNIQUENESS
#include "third_party/protobuf/version.h"
#endif
// @@protoc_insertion_point(includes)
namespace fmuproxy {
    namespace grpc {
    }  // namespace grpc
}  // namespace fmuproxy
namespace protobuf_service_2eproto {
    const ::google::protobuf::uint32 TableStruct::offsets[1] = {};
    static const ::google::protobuf::internal::MigrationSchema *schemas = NULL;
    static const ::google::protobuf::Message *const *file_default_instances = NULL;

    void protobuf_AssignDescriptors() {
        AddDescriptors();
        ::google::protobuf::MessageFactory *factory = NULL;
        AssignDescriptors(
                "service.proto", schemas, file_default_instances, TableStruct::offsets, factory,
                NULL, NULL, NULL);
    }

    void protobuf_AssignDescriptorsOnce() {
        static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
        ::google::protobuf::GoogleOnceInit(&once, &protobuf_AssignDescriptors);
    }

    void protobuf_RegisterTypes(const ::std::string &) GOOGLE_PROTOBUF_ATTRIBUTE_COLD;

    void protobuf_RegisterTypes(const ::std::string &) {
        protobuf_AssignDescriptorsOnce();
    }

    void AddDescriptorsImpl() {
        InitDefaults();
        static const char descriptor[] GOOGLE_PROTOBUF_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
                "\n\rservice.proto\022\rfmuproxy.grpc\032\033google/p"
                "rotobuf/empty.proto\032\021definitions.proto2\343"
                "\017\n\nFmuService\022D\n\026GetModelDescriptionXml\022"
                "\026.google.protobuf.Empty\032\022.fmuproxy.grpc."
                "Str\022N\n\023GetModelDescription\022\026.google.prot"
                "obuf.Empty\032\037.fmuproxy.grpc.ModelDescript"
                "ion\022C\n\024CreateInstanceFromCS\022\026.google.pro"
                "tobuf.Empty\032\023.fmuproxy.grpc.UInt\022B\n\024Crea"
                "teInstanceFromME\022\025.fmuproxy.grpc.Solver\032"
                "\023.fmuproxy.grpc.UInt\022:\n\016GetCurrentTime\022\023"
                ".fmuproxy.grpc.UInt\032\023.fmuproxy.grpc.Real"
                "\0228\n\014IsTerminated\022\023.fmuproxy.grpc.UInt\032\023."
                "fmuproxy.grpc.Bool\022@\n\024CanGetAndSetFMUsta"
                "te\022\023.fmuproxy.grpc.UInt\032\023.fmuproxy.grpc."
                "Bool\022A\n\004Init\022\032.fmuproxy.grpc.InitRequest"
                "\032\035.fmuproxy.grpc.StatusResponse\022=\n\004Step\022"
                "\032.fmuproxy.grpc.StepRequest\032\031.fmuproxy.g"
                "rpc.StepResult\022\?\n\tTerminate\022\023.fmuproxy.g"
                "rpc.UInt\032\035.fmuproxy.grpc.StatusResponse\022"
                ";\n\005Reset\022\023.fmuproxy.grpc.UInt\032\035.fmuproxy"
                ".grpc.StatusResponse\022E\n\013ReadInteger\022\032.fm"
                "uproxy.grpc.ReadRequest\032\032.fmuproxy.grpc."
                "IntegerRead\022\?\n\010ReadReal\022\032.fmuproxy.grpc."
                "ReadRequest\032\027.fmuproxy.grpc.RealRead\022C\n\n"
                "ReadString\022\032.fmuproxy.grpc.ReadRequest\032\031"
                ".fmuproxy.grpc.StringRead\022E\n\013ReadBoolean"
                "\022\032.fmuproxy.grpc.ReadRequest\032\032.fmuproxy."
                "grpc.BooleanRead\022Q\n\017BulkReadInteger\022\036.fm"
                "uproxy.grpc.BulkReadRequest\032\036.fmuproxy.g"
                "rpc.BulkIntegerRead\022K\n\014BulkReadReal\022\036.fm"
                "uproxy.grpc.BulkReadRequest\032\033.fmuproxy.g"
                "rpc.BulkRealRead\022O\n\016BulkReadString\022\036.fmu"
                "proxy.grpc.BulkReadRequest\032\035.fmuproxy.gr"
                "pc.BulkStringRead\022Q\n\017BulkReadBoolean\022\036.f"
                "muproxy.grpc.BulkReadRequest\032\036.fmuproxy."
                "grpc.BulkBooleanRead\022Q\n\014WriteInteger\022\".f"
                "muproxy.grpc.WriteIntegerRequest\032\035.fmupr"
                "oxy.grpc.StatusResponse\022K\n\tWriteReal\022\037.f"
                "muproxy.grpc.WriteRealRequest\032\035.fmuproxy"
                ".grpc.StatusResponse\022O\n\013WriteString\022!.fm"
                "uproxy.grpc.WriteStringRequest\032\035.fmuprox"
                "y.grpc.StatusResponse\022Q\n\014WriteBoolean\022\"."
                "fmuproxy.grpc.WriteBooleanRequest\032\035.fmup"
                "roxy.grpc.StatusResponse\022Y\n\020BulkWriteInt"
                "eger\022&.fmuproxy.grpc.BulkWriteIntegerReq"
                "uest\032\035.fmuproxy.grpc.StatusResponse\022S\n\rB"
                "ulkWriteReal\022#.fmuproxy.grpc.BulkWriteRe"
                "alRequest\032\035.fmuproxy.grpc.StatusResponse"
                "\022W\n\017BulkWriteString\022%.fmuproxy.grpc.Bulk"
                "WriteStringRequest\032\035.fmuproxy.grpc.Statu"
                "sResponse\022Y\n\020BulkWriteBoolean\022&.fmuproxy"
                ".grpc.BulkWriteBooleanRequest\032\035.fmuproxy"
                ".grpc.StatusResponseB#\n!no.mechatronics."
                "sfi.fmuproxy.grpcb\006proto3"
        };
        ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
                descriptor, 2145);
        ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
                "service.proto", &protobuf_RegisterTypes);
        ::protobuf_google_2fprotobuf_2fempty_2eproto::AddDescriptors();
        ::protobuf_definitions_2eproto::AddDescriptors();
    }

    void AddDescriptors() {
        static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
        ::google::protobuf::GoogleOnceInit(&once, &AddDescriptorsImpl);
    }

// Force AddDescriptors() to be called at dynamic initialization time.
    struct StaticDescriptorInitializer {
        StaticDescriptorInitializer() {
            AddDescriptors();
        }
    } static_descriptor_initializer;
}  // namespace protobuf_service_2eproto
namespace fmuproxy {
    namespace grpc {

// @@protoc_insertion_point(namespace_scope)
    }  // namespace grpc
}  // namespace fmuproxy

// @@protoc_insertion_point(global_scope)
