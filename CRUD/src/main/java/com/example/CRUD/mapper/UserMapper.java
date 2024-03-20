package com.example.CRUD.mapper;

import com.example.CRUD.domain.UserDTO;

public class UserMapper {
    public static UserDTO toDTO(UserDTO user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public static UserDTO toEntity(UserDTO dto) {
        UserDTO user = new UserDTO();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return user;
    }
}