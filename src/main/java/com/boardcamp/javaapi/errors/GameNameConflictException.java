package com.boardcamp.javaapi.errors;

public class GameNameConflictException extends RuntimeException {
    public GameNameConflictException(String message) {
        super(message);
    }
}
