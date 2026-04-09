package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {
	private int id;
	private String name;
	private String course;
	private int year;
	
	public Student(@Value("859")int id,@Value("Rahul")String name) {
		this.id=id;
		this.name=name;
	}
	
	@Value("DBMS")
	public void setCourse(String course) {
		this.course=course;
		
	}
	
	@Value("4")
	public void setYear(int year) {
		this.year=year;
	}
	
	public void display() {
		System.out.println("Student Id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Course: "+course);
		System.out.println("year: "+year);
		System.out.println(" ");
		

	}
}
