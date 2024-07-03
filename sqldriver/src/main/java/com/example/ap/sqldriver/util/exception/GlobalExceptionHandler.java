package com.example.ap.sqldriver.util.exception;

import com.example.ap.sqldriver.util.exception.custom_exception.BadRequestException;
import com.example.ap.sqldriver.util.exception.custom_exception.NotFoundException;
import com.example.ap.sqldriver.util.exception.error_response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFoundException(NotFoundException e) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        return new ErrorResponse(httpStatus.value(), httpStatus.name(), e.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleBadRequestException(BadRequestException e) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        return new ErrorResponse(httpStatus.value(), httpStatus.name(), e.getMessage());
    }
}
