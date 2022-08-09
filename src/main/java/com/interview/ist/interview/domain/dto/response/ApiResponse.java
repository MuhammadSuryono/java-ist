package com.interview.ist.interview.domain.dto.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@Builder
public class ApiResponse<T extends Serializable> implements Serializable{
    private HttpStatus status;
    private String message;
    private T data;

}
