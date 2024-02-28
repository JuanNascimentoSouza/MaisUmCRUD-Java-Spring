package com.example.CRUD.controller;

import com.example.CRUD.domain.model.Course;
import com.example.CRUD.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
    private final CourseRepository courseRepository;
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        // System.out.println(course.getName());
        //return courseRepository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(courseRepository.save(course));
    }

}