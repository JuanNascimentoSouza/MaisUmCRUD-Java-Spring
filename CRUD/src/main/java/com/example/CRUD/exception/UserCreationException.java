package com.example.CRUD.exception;

import com.example.CRUD.domain.User;

public class UserCreationException extends RuntimeException{
    private final User user;

    public UserCreationException(User user, String message) {
        super("Failed to create user: " + user + ". Reason: " + message);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
