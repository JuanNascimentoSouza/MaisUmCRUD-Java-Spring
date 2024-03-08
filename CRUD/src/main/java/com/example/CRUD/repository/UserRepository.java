package com.example.CRUD.repository;

import com.example.CRUD.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);

    Optional<User> findById(Long id);

    void deleteById(Long id);
}
