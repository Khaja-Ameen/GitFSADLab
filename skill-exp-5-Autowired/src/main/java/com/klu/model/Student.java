package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int stuId;
	private String stuName;
	private String gender;
	
	@Autowired
	private Certification certification;
	
	public Student() {
		this.stuId=586;
		this.stuName="Shaik Khaja Ameen";
		this.gender="Male";
	}
	
	public void display() {
		System.out.println("Student Id: "+stuId);
		System.out.println("stuName: "+stuName);
		System.out.println("Gender: "+gender);
		System.out.println("");
		System.out.println("Certification Course Id: "+certification.getId());
		System.out.println("Certification Course Name: "+certification.getName());
		System.out.println("Completion Date: "+certification.getCompletionDate());
		
	}

}
