package com.boardcamp.javaapi.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Para cada tipo de erro criado, criamos um @ExceptionHandler
    @ExceptionHandler({ GameNotFoundException.class })
    public ResponseEntity<String> handleUserNotFound(GameNotFoundException exception) {
        // E então podemos descrever a resposta que o usuário da API irá receber
        // Com status e a mensagem que determinamos no construtor do erro
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler({ GameNameConflictException.class })
    public ResponseEntity<String> handleUserNameConflict(GameNameConflictException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }
}