package com.sanchit.linkedin.post_service.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class APIError {
    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus statusCode;
}
