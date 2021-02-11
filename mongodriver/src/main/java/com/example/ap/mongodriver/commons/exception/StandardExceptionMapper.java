package com.example.ap.mongodriver.commons.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class StandardExceptionMapper implements ExceptionMapper<StandardException> {
    @Override
    public Response toResponse(StandardException e) {
        return Response.status(e.getStatus()).entity(e.getPayload()).type(MediaType.APPLICATION_JSON).build();
    }
}
