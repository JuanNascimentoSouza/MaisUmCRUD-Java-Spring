package com.example.CRUD.service;


import com.example.CRUD.domain.model.Course;
import com.example.CRUD.exception.RecordNotFoundException;
import com.example.CRUD.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@Service
public class CourseService {
    private final CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> list() {
        return courseRepository.findAll();
    }

    public Course findById(@PathVariable @NotNull @Positive Long id) {
        return (Course) courseRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public Course create(@Valid Course course) {
        return courseRepository.save(course).getBody();
    }

    public Course update(@NotNull @Positive Long id, @Valid Course course) {
        return courseRepository.findById(id)
                .map(recordFound -> {
                    recordFound(course.getName());
                    recordFound(course.getCategory());
                    return courseRepository.save((Course) recordFound);
                }).orElseThrow(() -> new RecordNotFoundException(id)).getBody();
    }

    private void recordFound(String name) {

    }


    public void delete(@PathVariable @NotNull @Positive Long id) {
        courseRepository.delete(courseRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(id)));
    }
}