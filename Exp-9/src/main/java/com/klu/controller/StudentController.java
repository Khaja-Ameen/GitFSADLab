package com.klu.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.exception.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private List<Student> students = Arrays.asList(
            new Student(1, "Ameen", "CSE"),
            new Student(2, "Rahul", "IT"),
            new Student(3, "Sara", "AI")
    );

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {

        if (id <= 0) {
            throw new InvalidInputException("ID must be positive");
        }

        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new StudentNotFoundException("Student not found with ID: " + id));
    }
}