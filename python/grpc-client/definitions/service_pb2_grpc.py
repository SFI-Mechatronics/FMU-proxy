# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import definitions.definitions_pb2 as definitions__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


class FmuServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetModelDescriptionXml = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/GetModelDescriptionXml',
        request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
        response_deserializer=definitions__pb2.Str.FromString,
        )
    self.GetModelDescription = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/GetModelDescription',
        request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
        response_deserializer=definitions__pb2.ModelDescription.FromString,
        )
    self.CreateInstanceFromCS = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/CreateInstanceFromCS',
        request_serializer=google_dot_protobuf_dot_empty__pb2.Empty.SerializeToString,
        response_deserializer=definitions__pb2.UInt.FromString,
        )
    self.CreateInstanceFromME = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/CreateInstanceFromME',
        request_serializer=definitions__pb2.Solver.SerializeToString,
        response_deserializer=definitions__pb2.UInt.FromString,
        )
    self.GetSimulationTime = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/GetSimulationTime',
        request_serializer=definitions__pb2.UInt.SerializeToString,
        response_deserializer=definitions__pb2.Real.FromString,
        )
    self.IsTerminated = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/IsTerminated',
        request_serializer=definitions__pb2.UInt.SerializeToString,
        response_deserializer=definitions__pb2.Bool.FromString,
        )
    self.CanGetAndSetFMUstate = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/CanGetAndSetFMUstate',
        request_serializer=definitions__pb2.UInt.SerializeToString,
        response_deserializer=definitions__pb2.Bool.FromString,
        )
    self.Init = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/Init',
        request_serializer=definitions__pb2.InitRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.Step = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/Step',
        request_serializer=definitions__pb2.StepRequest.SerializeToString,
        response_deserializer=definitions__pb2.StepResult.FromString,
        )
    self.Terminate = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/Terminate',
        request_serializer=definitions__pb2.UInt.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.Reset = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/Reset',
        request_serializer=definitions__pb2.UInt.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.ReadInteger = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/ReadInteger',
        request_serializer=definitions__pb2.ReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.IntegerRead.FromString,
        )
    self.ReadReal = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/ReadReal',
        request_serializer=definitions__pb2.ReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.RealRead.FromString,
        )
    self.ReadString = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/ReadString',
        request_serializer=definitions__pb2.ReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.StringRead.FromString,
        )
    self.ReadBoolean = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/ReadBoolean',
        request_serializer=definitions__pb2.ReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.BooleanRead.FromString,
        )
    self.BulkReadInteger = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkReadInteger',
        request_serializer=definitions__pb2.BulkReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.BulkIntegerRead.FromString,
        )
    self.BulkReadReal = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkReadReal',
        request_serializer=definitions__pb2.BulkReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.BulkRealRead.FromString,
        )
    self.BulkReadString = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkReadString',
        request_serializer=definitions__pb2.BulkReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.BulkStringRead.FromString,
        )
    self.BulkReadBoolean = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkReadBoolean',
        request_serializer=definitions__pb2.BulkReadRequest.SerializeToString,
        response_deserializer=definitions__pb2.BulkBooleanRead.FromString,
        )
    self.WriteInteger = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/WriteInteger',
        request_serializer=definitions__pb2.WriteIntegerRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.WriteReal = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/WriteReal',
        request_serializer=definitions__pb2.WriteRealRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.WriteString = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/WriteString',
        request_serializer=definitions__pb2.WriteStringRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.WriteBoolean = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/WriteBoolean',
        request_serializer=definitions__pb2.WriteBooleanRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.BulkWriteInteger = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkWriteInteger',
        request_serializer=definitions__pb2.BulkWriteIntegerRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.BulkWriteReal = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkWriteReal',
        request_serializer=definitions__pb2.BulkWriteRealRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.BulkWriteString = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkWriteString',
        request_serializer=definitions__pb2.BulkWriteStringRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )
    self.BulkWriteBoolean = channel.unary_unary(
        '/fmuproxy.grpc.FmuService/BulkWriteBoolean',
        request_serializer=definitions__pb2.BulkWriteBooleanRequest.SerializeToString,
        response_deserializer=definitions__pb2.StatusResponse.FromString,
        )


class FmuServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetModelDescriptionXml(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetModelDescription(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateInstanceFromCS(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CreateInstanceFromME(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def GetSimulationTime(self, request, context):
    """instance methods

    """
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def IsTerminated(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def CanGetAndSetFMUstate(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Init(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Step(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Terminate(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Reset(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ReadInteger(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ReadReal(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ReadString(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def ReadBoolean(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkReadInteger(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkReadReal(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkReadString(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkReadBoolean(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def WriteInteger(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def WriteReal(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def WriteString(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def WriteBoolean(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkWriteInteger(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkWriteReal(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkWriteString(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def BulkWriteBoolean(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_FmuServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetModelDescriptionXml': grpc.unary_unary_rpc_method_handler(
          servicer.GetModelDescriptionXml,
          request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
          response_serializer=definitions__pb2.Str.SerializeToString,
      ),
      'GetModelDescription': grpc.unary_unary_rpc_method_handler(
          servicer.GetModelDescription,
          request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
          response_serializer=definitions__pb2.ModelDescription.SerializeToString,
      ),
      'CreateInstanceFromCS': grpc.unary_unary_rpc_method_handler(
          servicer.CreateInstanceFromCS,
          request_deserializer=google_dot_protobuf_dot_empty__pb2.Empty.FromString,
          response_serializer=definitions__pb2.UInt.SerializeToString,
      ),
      'CreateInstanceFromME': grpc.unary_unary_rpc_method_handler(
          servicer.CreateInstanceFromME,
          request_deserializer=definitions__pb2.Solver.FromString,
          response_serializer=definitions__pb2.UInt.SerializeToString,
      ),
      'GetSimulationTime': grpc.unary_unary_rpc_method_handler(
          servicer.GetSimulationTime,
          request_deserializer=definitions__pb2.UInt.FromString,
          response_serializer=definitions__pb2.Real.SerializeToString,
      ),
      'IsTerminated': grpc.unary_unary_rpc_method_handler(
          servicer.IsTerminated,
          request_deserializer=definitions__pb2.UInt.FromString,
          response_serializer=definitions__pb2.Bool.SerializeToString,
      ),
      'CanGetAndSetFMUstate': grpc.unary_unary_rpc_method_handler(
          servicer.CanGetAndSetFMUstate,
          request_deserializer=definitions__pb2.UInt.FromString,
          response_serializer=definitions__pb2.Bool.SerializeToString,
      ),
      'Init': grpc.unary_unary_rpc_method_handler(
          servicer.Init,
          request_deserializer=definitions__pb2.InitRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'Step': grpc.unary_unary_rpc_method_handler(
          servicer.Step,
          request_deserializer=definitions__pb2.StepRequest.FromString,
          response_serializer=definitions__pb2.StepResult.SerializeToString,
      ),
      'Terminate': grpc.unary_unary_rpc_method_handler(
          servicer.Terminate,
          request_deserializer=definitions__pb2.UInt.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'Reset': grpc.unary_unary_rpc_method_handler(
          servicer.Reset,
          request_deserializer=definitions__pb2.UInt.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'ReadInteger': grpc.unary_unary_rpc_method_handler(
          servicer.ReadInteger,
          request_deserializer=definitions__pb2.ReadRequest.FromString,
          response_serializer=definitions__pb2.IntegerRead.SerializeToString,
      ),
      'ReadReal': grpc.unary_unary_rpc_method_handler(
          servicer.ReadReal,
          request_deserializer=definitions__pb2.ReadRequest.FromString,
          response_serializer=definitions__pb2.RealRead.SerializeToString,
      ),
      'ReadString': grpc.unary_unary_rpc_method_handler(
          servicer.ReadString,
          request_deserializer=definitions__pb2.ReadRequest.FromString,
          response_serializer=definitions__pb2.StringRead.SerializeToString,
      ),
      'ReadBoolean': grpc.unary_unary_rpc_method_handler(
          servicer.ReadBoolean,
          request_deserializer=definitions__pb2.ReadRequest.FromString,
          response_serializer=definitions__pb2.BooleanRead.SerializeToString,
      ),
      'BulkReadInteger': grpc.unary_unary_rpc_method_handler(
          servicer.BulkReadInteger,
          request_deserializer=definitions__pb2.BulkReadRequest.FromString,
          response_serializer=definitions__pb2.BulkIntegerRead.SerializeToString,
      ),
      'BulkReadReal': grpc.unary_unary_rpc_method_handler(
          servicer.BulkReadReal,
          request_deserializer=definitions__pb2.BulkReadRequest.FromString,
          response_serializer=definitions__pb2.BulkRealRead.SerializeToString,
      ),
      'BulkReadString': grpc.unary_unary_rpc_method_handler(
          servicer.BulkReadString,
          request_deserializer=definitions__pb2.BulkReadRequest.FromString,
          response_serializer=definitions__pb2.BulkStringRead.SerializeToString,
      ),
      'BulkReadBoolean': grpc.unary_unary_rpc_method_handler(
          servicer.BulkReadBoolean,
          request_deserializer=definitions__pb2.BulkReadRequest.FromString,
          response_serializer=definitions__pb2.BulkBooleanRead.SerializeToString,
      ),
      'WriteInteger': grpc.unary_unary_rpc_method_handler(
          servicer.WriteInteger,
          request_deserializer=definitions__pb2.WriteIntegerRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'WriteReal': grpc.unary_unary_rpc_method_handler(
          servicer.WriteReal,
          request_deserializer=definitions__pb2.WriteRealRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'WriteString': grpc.unary_unary_rpc_method_handler(
          servicer.WriteString,
          request_deserializer=definitions__pb2.WriteStringRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'WriteBoolean': grpc.unary_unary_rpc_method_handler(
          servicer.WriteBoolean,
          request_deserializer=definitions__pb2.WriteBooleanRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'BulkWriteInteger': grpc.unary_unary_rpc_method_handler(
          servicer.BulkWriteInteger,
          request_deserializer=definitions__pb2.BulkWriteIntegerRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'BulkWriteReal': grpc.unary_unary_rpc_method_handler(
          servicer.BulkWriteReal,
          request_deserializer=definitions__pb2.BulkWriteRealRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'BulkWriteString': grpc.unary_unary_rpc_method_handler(
          servicer.BulkWriteString,
          request_deserializer=definitions__pb2.BulkWriteStringRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
      'BulkWriteBoolean': grpc.unary_unary_rpc_method_handler(
          servicer.BulkWriteBoolean,
          request_deserializer=definitions__pb2.BulkWriteBooleanRequest.FromString,
          response_serializer=definitions__pb2.StatusResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'fmuproxy.grpc.FmuService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))