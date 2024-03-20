package com.example.CRUD.repository;

import com.example.CRUD.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDTO,Long> {
    UserDTO save(UserDTO user);

    Optional<UserDTO> findById(Long id);

    void deleteById(Long id);
}
