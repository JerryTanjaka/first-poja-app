package com.calc.app.handler;

import com.calc.app.model.exception.NegativeNumberException;
import com.calc.app.model.exception.ZeroDivisionError;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NegativeNumberException.class)
    public ResponseEntity<Map<String, String>> handleNegative(NegativeNumberException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
    }

    @ExceptionHandler(ZeroDivisionError.class)
    public ResponseEntity<Map<String, String>> handleZeroDivision(ZeroDivisionError e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
    }
}