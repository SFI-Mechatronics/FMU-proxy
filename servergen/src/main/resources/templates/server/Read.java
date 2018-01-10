
    @Override
    public void read{{varName2}}( FmiDefinitions.ModelReference req, StreamObserver<FmiDefinitions.{{returnType}}> responseObserver) {

        FmiSimulation fmu = fmus.get(req.getFmuId());
        {{primitive2}}Reader reader = fmu.getReader({{valueReference}}).as{{primitive2}}Reader();
        FmiDefinitions.{{returnType}} reply =  FmiDefinitions.{{returnType}}.newBuilder().setValue(reader.read()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }