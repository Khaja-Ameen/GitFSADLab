package com.klu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Course;
import com.klu.repo.CourseRepo;
import com.klu.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo repo;
	
	@Override
	public Course addCourse(Course course) {
		return repo.save(course);
	}
	
	@Override
	public Course updateCourse(int id,Course course) {
		if(repo.existsById(id))
		{
			course.setId(id);
			return repo.save(course);
		}
		return null;
	}
	
	
	@Override
	public String deleteCourse(int id) {
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return "Deleted successfully";
		}
		return "record not found";
	}
	
	@Override 
	public List<Course> getAllCourses(){
		return repo.findAll();
	}
	
	
	
	
}
