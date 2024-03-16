package com.example.CRUD.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex) {

        // Mensagem erro personalizado
        String errorMessage = "User with ID " + ex.getUserId() + " not found";

        // Objeto de resposta com status NOT_FOUND e mensagem de erro
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
