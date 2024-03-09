package com.example.CRUD.exception;

public class UserDeleteException extends RuntimeException{

    private final Long userId;

    public UserDeleteException(Long userId, String message) {
        super("Failed to delete user with ID " + userId + ": " + message);
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

}
