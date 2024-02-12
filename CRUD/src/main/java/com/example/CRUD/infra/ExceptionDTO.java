package com.example.CRUD.infra;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ExceptionDTO {
    String message;
    Integer status;
    public ExceptionDTO(String message) {
        this.message = message;
        this.status = status;
    }
}