package com.example.CRUD.exception;

import com.example.CRUD.domain.UserDTO;

public class UserCreationException extends RuntimeException{
    private final UserDTO user;

    public UserCreationException(UserDTO user, String message) {
        super("Failed to create user: " + user + ". Reason: " + message);
        this.user = user;
    }

    public UserDTO getUser() {
        return user;
    }

}
