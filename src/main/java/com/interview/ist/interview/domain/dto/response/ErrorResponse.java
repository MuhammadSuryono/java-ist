package com.interview.ist.interview.domain.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Arrays;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ErrorResponse {
    private HttpStatus status;
    private String message;
    private StackTraceElement[] stackTrace;

    public ErrorResponse(HttpStatus httpStatus) {
        this.status = httpStatus;
    }

    public ErrorResponse(HttpStatus httpStatus, String message) {
        this.status = httpStatus;
        this.message = message;
    }

    public ErrorResponse(HttpStatus httpStatus, String message, StackTraceElement[] stackTrace) {
        this.status = httpStatus;
        this.message = message;
        this.stackTrace = stackTrace;
    }

    public ErrorResponse(HttpStatus httpStatus, LocalDateTime localDateTime, String message) {
        this.status = httpStatus;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StackTraceElement[] getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(StackTraceElement[] stackTrace) {
        this.stackTrace = stackTrace;
    }
}
