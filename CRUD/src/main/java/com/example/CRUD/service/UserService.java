package com.example.CRUD.service;

import com.example.CRUD.domain.UserDTO;
import com.example.CRUD.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO user){
        return userRepository.save(user);
    }

    public UserDTO getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserDTO updateUser(Long id, UserDTO user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
