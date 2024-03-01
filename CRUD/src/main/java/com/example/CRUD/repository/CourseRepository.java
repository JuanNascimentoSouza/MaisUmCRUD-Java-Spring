package com.example.CRUD.repository;

import com.example.CRUD.domain.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    ResponseEntity<Course> save(Course course);

    List<Course> findAll();

    Optional<Object> findById(Long id);

    void delete(Object orElseThrow);
}
