package com.example.ap.sqldriver.util.exception.custom_exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
