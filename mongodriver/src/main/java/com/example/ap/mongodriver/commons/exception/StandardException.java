package com.example.ap.mongodriver.commons.exception;

import javax.ws.rs.core.Response.Status;

public class StandardException extends RuntimeException {
    private Status status;
    private ErrorEntity payload;

    public StandardException() {}

    public StandardException(String message, Status status) {
        super(message);
        this.status = status;
        setPayload(new ErrorEntity(status, message));
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ErrorEntity getPayload() {
        return payload;
    }

    public void setPayload(ErrorEntity payload) {
        this.payload = payload;
    }
}
