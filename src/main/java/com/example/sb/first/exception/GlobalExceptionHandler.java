package com.example.sb.first.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    //SLF4j log implementation - started
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleResourceNotFound(ResourceNotFoundException exception){
        Map<String, Object> resourceError = new HashMap<>();
        resourceError.put("timestamp: ", LocalDateTime.now());
        resourceError.put("status: ", HttpStatus.NOT_FOUND.value());
        resourceError.put("error: ", "Not Found");
        resourceError.put("message: ", exception.getMessage());
        logger.error("Resource not found", exception); //display error log trace on console
        logger.error("Unhandled exception", exception); //display error log trace on console
        return new ResponseEntity<>(resourceError, HttpStatus.NOT_FOUND);
    }

    //This ensures all exceptions are handled centrally.
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericException(Exception genericException){
        Map<String, Object> genericError = new HashMap<>();
        genericError.put("timestamp: ", LocalDateTime.now());
        genericError.put("status: ", HttpStatus.INTERNAL_SERVER_ERROR.value());
        genericError.put("error: ", "Internal Server Error");
        genericError.put("message: ", genericException.getMessage());
        return new ResponseEntity<>(genericError, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
