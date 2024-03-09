package com.example.CRUD.exception;

public class UserNotFoundException extends RuntimeException {

    private final Long userId;

    public UserNotFoundException(Long userId) {
        super("User with ID " + userId + " no found");
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
