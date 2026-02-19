package com.klu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")

public class Course {
	
	@Id

	private int id;
	private String title;
	private int duration;
	private int fee;
	public Course() {
		
	}
	
	public Course(int id,String title,int duration, int fee) {
		this.id=id;
		this.title=title;
		this.duration=duration;
		this.fee=fee;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	
	
	public int  getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}
	public int getFee() {
		return fee;
	}
	
	
	
	
}
