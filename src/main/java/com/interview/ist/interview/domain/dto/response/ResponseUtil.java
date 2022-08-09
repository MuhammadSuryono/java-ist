package com.interview.ist.interview.domain.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public class ResponseUtil {

    public static <T extends Serializable> ResponseEntity<Object> buildResponse(String messageKey, T data, HttpStatus httpStatus) {
        return new ResponseEntity(buildResponse(httpStatus, messageKey, data), httpStatus);
    }

    public static <T extends Serializable> ApiResponse buildResponse(HttpStatus status, String messageKey, T data) {
        return buildResponse1(status, messageKey, (Serializable) data);
    }

    public static <T extends Serializable> ApiResponse buildResponse1(HttpStatus status, String messageKey, T data) {
        return ApiResponse.builder().status(status).message(messageKey).data(data).build();
    }
}
