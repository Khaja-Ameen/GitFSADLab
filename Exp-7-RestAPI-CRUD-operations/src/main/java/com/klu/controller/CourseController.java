package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Course;
import com.klu.service.CourseService;

@RestController
@RequestMapping("/course")

public class CourseController {

	@Autowired
	private CourseService service;
	
	@PostMapping("/add")
	public Course addCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}
	
	@PutMapping("/update/{id}")
	public Course updateCourse(@PathVariable int id, @RequestBody Course course) {
		return service.updateCourse(id,course);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable  int id)
	{
		return service.deleteCourse(id);
	}
	
	@GetMapping("/getall")
	public List<Course> getAllCourses(){
		return service.getAllCourses();
		
	}
	
	
}
