package com.example.ap.mongodriver.commons.exception;

import javax.ws.rs.core.Response.Status;

public class ErrorEntity {
    private int statusCode;
    private String statusMessage;
    private String errorMessage;

    public ErrorEntity() {}

    public ErrorEntity(Status status, String errorMessage) {
        this.statusCode = status.getStatusCode();
        this.statusMessage = status.getReasonPhrase();
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
