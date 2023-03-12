package com.example.SampleDatabasePractice.exception;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.ZonedDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<RecordErrorResponse> recordNotFoundHandler(RecordNotFound rc, HttpServletRequest req){
        RecordErrorResponse recordErrorResponse = new RecordErrorResponse(ZonedDateTime.now(),
                HttpStatus.NOT_FOUND.value(), req.getRequestURI(),rc.getMessage());
        return new ResponseEntity<>(recordErrorResponse,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public ResponseEntity<RecordErrorResponse> genericException(Exception e,HttpServletRequest req){
        RecordErrorResponse recordErrorResponse = new RecordErrorResponse(ZonedDateTime.now(),
                HttpStatus.NOT_FOUND.value(), req.getRequestURI(),e.getMessage());
        return new ResponseEntity<>(recordErrorResponse,HttpStatus.BAD_REQUEST);

    }
}
