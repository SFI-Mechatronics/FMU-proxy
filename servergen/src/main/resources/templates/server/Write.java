

    @Override
    public void write{{varName2}} (FmiDefinitions.{{dataType}}Write req, StreamObserver<FmiDefinitions.Status> responseObserver) {

        FmiSimulation fmu = fmus.get(req.getFmuId());
        {{dataType}}Writer writer = fmu.getWriter({{valueReference}}).as{{dataType}}Writer();
        writer.write(req.getValue());
        statusReply(fmu.getLastStatus(), responseObserver);

    }