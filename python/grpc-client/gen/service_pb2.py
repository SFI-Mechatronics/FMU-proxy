# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: service.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
import gen.definitions_pb2 as definitions__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='service.proto',
  package='fmuproxy.grpc',
  syntax='proto3',
  serialized_pb=_b('\n\rservice.proto\x12\rfmuproxy.grpc\x1a\x1bgoogle/protobuf/empty.proto\x1a\x11\x64\x65\x66initions.proto2\xe3\x0f\n\nFmuService\x12\x44\n\x16GetModelDescriptionXml\x12\x16.google.protobuf.Empty\x1a\x12.fmuproxy.grpc.Str\x12N\n\x13GetModelDescription\x12\x16.google.protobuf.Empty\x1a\x1f.fmuproxy.grpc.ModelDescription\x12\x43\n\x14\x43reateInstanceFromCS\x12\x16.google.protobuf.Empty\x1a\x13.fmuproxy.grpc.UInt\x12\x42\n\x14\x43reateInstanceFromME\x12\x15.fmuproxy.grpc.Solver\x1a\x13.fmuproxy.grpc.UInt\x12:\n\x0eGetCurrentTime\x12\x13.fmuproxy.grpc.UInt\x1a\x13.fmuproxy.grpc.Real\x12\x38\n\x0cIsTerminated\x12\x13.fmuproxy.grpc.UInt\x1a\x13.fmuproxy.grpc.Bool\x12@\n\x14\x43\x61nGetAndSetFMUstate\x12\x13.fmuproxy.grpc.UInt\x1a\x13.fmuproxy.grpc.Bool\x12\x41\n\x04Init\x12\x1a.fmuproxy.grpc.InitRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12=\n\x04Step\x12\x1a.fmuproxy.grpc.StepRequest\x1a\x19.fmuproxy.grpc.StepResult\x12?\n\tTerminate\x12\x13.fmuproxy.grpc.UInt\x1a\x1d.fmuproxy.grpc.StatusResponse\x12;\n\x05Reset\x12\x13.fmuproxy.grpc.UInt\x1a\x1d.fmuproxy.grpc.StatusResponse\x12\x45\n\x0bReadInteger\x12\x1a.fmuproxy.grpc.ReadRequest\x1a\x1a.fmuproxy.grpc.IntegerRead\x12?\n\x08ReadReal\x12\x1a.fmuproxy.grpc.ReadRequest\x1a\x17.fmuproxy.grpc.RealRead\x12\x43\n\nReadString\x12\x1a.fmuproxy.grpc.ReadRequest\x1a\x19.fmuproxy.grpc.StringRead\x12\x45\n\x0bReadBoolean\x12\x1a.fmuproxy.grpc.ReadRequest\x1a\x1a.fmuproxy.grpc.BooleanRead\x12Q\n\x0f\x42ulkReadInteger\x12\x1e.fmuproxy.grpc.BulkReadRequest\x1a\x1e.fmuproxy.grpc.BulkIntegerRead\x12K\n\x0c\x42ulkReadReal\x12\x1e.fmuproxy.grpc.BulkReadRequest\x1a\x1b.fmuproxy.grpc.BulkRealRead\x12O\n\x0e\x42ulkReadString\x12\x1e.fmuproxy.grpc.BulkReadRequest\x1a\x1d.fmuproxy.grpc.BulkStringRead\x12Q\n\x0f\x42ulkReadBoolean\x12\x1e.fmuproxy.grpc.BulkReadRequest\x1a\x1e.fmuproxy.grpc.BulkBooleanRead\x12Q\n\x0cWriteInteger\x12\".fmuproxy.grpc.WriteIntegerRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12K\n\tWriteReal\x12\x1f.fmuproxy.grpc.WriteRealRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12O\n\x0bWriteString\x12!.fmuproxy.grpc.WriteStringRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12Q\n\x0cWriteBoolean\x12\".fmuproxy.grpc.WriteBooleanRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12Y\n\x10\x42ulkWriteInteger\x12&.fmuproxy.grpc.BulkWriteIntegerRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12S\n\rBulkWriteReal\x12#.fmuproxy.grpc.BulkWriteRealRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12W\n\x0f\x42ulkWriteString\x12%.fmuproxy.grpc.BulkWriteStringRequest\x1a\x1d.fmuproxy.grpc.StatusResponse\x12Y\n\x10\x42ulkWriteBoolean\x12&.fmuproxy.grpc.BulkWriteBooleanRequest\x1a\x1d.fmuproxy.grpc.StatusResponseB#\n!no.mechatronics.sfi.fmuproxy.grpcb\x06proto3')
  ,
  dependencies=[google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,definitions__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n!no.mechatronics.sfi.fmuproxy.grpc'))

_FMUSERVICE = _descriptor.ServiceDescriptor(
  name='FmuService',
  full_name='fmuproxy.grpc.FmuService',
  file=DESCRIPTOR,
  index=0,
  options=None,
  serialized_start=81,
  serialized_end=2100,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetModelDescriptionXml',
    full_name='fmuproxy.grpc.FmuService.GetModelDescriptionXml',
    index=0,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=definitions__pb2._STR,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetModelDescription',
    full_name='fmuproxy.grpc.FmuService.GetModelDescription',
    index=1,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=definitions__pb2._MODELDESCRIPTION,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='CreateInstanceFromCS',
    full_name='fmuproxy.grpc.FmuService.CreateInstanceFromCS',
    index=2,
    containing_service=None,
    input_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    output_type=definitions__pb2._UINT,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='CreateInstanceFromME',
    full_name='fmuproxy.grpc.FmuService.CreateInstanceFromME',
    index=3,
    containing_service=None,
    input_type=definitions__pb2._SOLVER,
    output_type=definitions__pb2._UINT,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetCurrentTime',
    full_name='fmuproxy.grpc.FmuService.GetCurrentTime',
    index=4,
    containing_service=None,
    input_type=definitions__pb2._UINT,
    output_type=definitions__pb2._REAL,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='IsTerminated',
    full_name='fmuproxy.grpc.FmuService.IsTerminated',
    index=5,
    containing_service=None,
    input_type=definitions__pb2._UINT,
    output_type=definitions__pb2._BOOL,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='CanGetAndSetFMUstate',
    full_name='fmuproxy.grpc.FmuService.CanGetAndSetFMUstate',
    index=6,
    containing_service=None,
    input_type=definitions__pb2._UINT,
    output_type=definitions__pb2._BOOL,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Init',
    full_name='fmuproxy.grpc.FmuService.Init',
    index=7,
    containing_service=None,
    input_type=definitions__pb2._INITREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Step',
    full_name='fmuproxy.grpc.FmuService.Step',
    index=8,
    containing_service=None,
    input_type=definitions__pb2._STEPREQUEST,
    output_type=definitions__pb2._STEPRESULT,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Terminate',
    full_name='fmuproxy.grpc.FmuService.Terminate',
    index=9,
    containing_service=None,
    input_type=definitions__pb2._UINT,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='Reset',
    full_name='fmuproxy.grpc.FmuService.Reset',
    index=10,
    containing_service=None,
    input_type=definitions__pb2._UINT,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ReadInteger',
    full_name='fmuproxy.grpc.FmuService.ReadInteger',
    index=11,
    containing_service=None,
    input_type=definitions__pb2._READREQUEST,
    output_type=definitions__pb2._INTEGERREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ReadReal',
    full_name='fmuproxy.grpc.FmuService.ReadReal',
    index=12,
    containing_service=None,
    input_type=definitions__pb2._READREQUEST,
    output_type=definitions__pb2._REALREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ReadString',
    full_name='fmuproxy.grpc.FmuService.ReadString',
    index=13,
    containing_service=None,
    input_type=definitions__pb2._READREQUEST,
    output_type=definitions__pb2._STRINGREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='ReadBoolean',
    full_name='fmuproxy.grpc.FmuService.ReadBoolean',
    index=14,
    containing_service=None,
    input_type=definitions__pb2._READREQUEST,
    output_type=definitions__pb2._BOOLEANREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkReadInteger',
    full_name='fmuproxy.grpc.FmuService.BulkReadInteger',
    index=15,
    containing_service=None,
    input_type=definitions__pb2._BULKREADREQUEST,
    output_type=definitions__pb2._BULKINTEGERREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkReadReal',
    full_name='fmuproxy.grpc.FmuService.BulkReadReal',
    index=16,
    containing_service=None,
    input_type=definitions__pb2._BULKREADREQUEST,
    output_type=definitions__pb2._BULKREALREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkReadString',
    full_name='fmuproxy.grpc.FmuService.BulkReadString',
    index=17,
    containing_service=None,
    input_type=definitions__pb2._BULKREADREQUEST,
    output_type=definitions__pb2._BULKSTRINGREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkReadBoolean',
    full_name='fmuproxy.grpc.FmuService.BulkReadBoolean',
    index=18,
    containing_service=None,
    input_type=definitions__pb2._BULKREADREQUEST,
    output_type=definitions__pb2._BULKBOOLEANREAD,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='WriteInteger',
    full_name='fmuproxy.grpc.FmuService.WriteInteger',
    index=19,
    containing_service=None,
    input_type=definitions__pb2._WRITEINTEGERREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='WriteReal',
    full_name='fmuproxy.grpc.FmuService.WriteReal',
    index=20,
    containing_service=None,
    input_type=definitions__pb2._WRITEREALREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='WriteString',
    full_name='fmuproxy.grpc.FmuService.WriteString',
    index=21,
    containing_service=None,
    input_type=definitions__pb2._WRITESTRINGREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='WriteBoolean',
    full_name='fmuproxy.grpc.FmuService.WriteBoolean',
    index=22,
    containing_service=None,
    input_type=definitions__pb2._WRITEBOOLEANREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkWriteInteger',
    full_name='fmuproxy.grpc.FmuService.BulkWriteInteger',
    index=23,
    containing_service=None,
    input_type=definitions__pb2._BULKWRITEINTEGERREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkWriteReal',
    full_name='fmuproxy.grpc.FmuService.BulkWriteReal',
    index=24,
    containing_service=None,
    input_type=definitions__pb2._BULKWRITEREALREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkWriteString',
    full_name='fmuproxy.grpc.FmuService.BulkWriteString',
    index=25,
    containing_service=None,
    input_type=definitions__pb2._BULKWRITESTRINGREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
  _descriptor.MethodDescriptor(
    name='BulkWriteBoolean',
    full_name='fmuproxy.grpc.FmuService.BulkWriteBoolean',
    index=26,
    containing_service=None,
    input_type=definitions__pb2._BULKWRITEBOOLEANREQUEST,
    output_type=definitions__pb2._STATUSRESPONSE,
    options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_FMUSERVICE)

DESCRIPTOR.services_by_name['FmuService'] = _FMUSERVICE

# @@protoc_insertion_point(module_scope)
