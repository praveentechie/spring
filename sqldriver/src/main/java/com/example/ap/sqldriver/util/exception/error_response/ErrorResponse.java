package com.example.ap.sqldriver.util.exception.error_response;

public class ErrorResponse {
    private int statusCode;
    private String statusMessage;
    private String errorMessage;

    public ErrorResponse() {}

    public ErrorResponse(int statusCode, String statusMessage, String errorMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
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
