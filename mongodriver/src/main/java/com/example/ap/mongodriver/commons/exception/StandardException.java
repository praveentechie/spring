package com.example.ap.mongodriver.commons.exception;

import javax.ws.rs.core.Response.Status;

public class StandardException extends RuntimeException {
    private Status status;

    public StandardException() {}

    public StandardException(String message, Status status) {
        super(message);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
