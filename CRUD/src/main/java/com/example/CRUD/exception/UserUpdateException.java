package com.example.CRUD.exception;

public class UserUpdateException extends RuntimeException {

    private final Long userId;

    public UserUpdateException(Long userId, String message) {
        super("Failed to update user with ID " + userId + ": " + message);
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}