package com.example.ap.sqldriver.util.exception.custom_exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
