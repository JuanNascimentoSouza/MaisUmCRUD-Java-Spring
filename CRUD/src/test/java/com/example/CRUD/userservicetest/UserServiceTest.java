package com.example.CRUD.userservicetest;

import com.example.CRUD.domain.User;
import com.example.CRUD.repository.UserRepository;
import com.example.CRUD.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void testCreateUser(){
        User user = new User(1L,"Test","test@example.com");
        when(userRepository.save(any(User.class))).thenReturn(user);

        User createdUser = userService.createUser(user);

        assertEquals(user.getName(),createdUser.getName());
        assertEquals(user.getEmail(),createdUser.getEmail());
        verify(userRepository).save(user);
    }

    @Test
    public void testGetUserById() {
        User user = new User(1L,"Test2","test@example.com");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        User foundUser = userService.getUserById(1L);

        assertEquals(user.getName(),foundUser.getName());
        assertEquals(user.getEmail(),foundUser.getEmail());
    }

    @Test
    public void testGetById_UserNotFound(){
        when(userRepository.findById(1L)).thenReturn(Optional.empty());

        User foundUser = userService.getUserById(1L);

        assertNull(foundUser,"User should be null");
    }

}
