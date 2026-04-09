package com.klu.model;

import org.springframework.stereotype.Component;

@Component

public class Certification {
	private int id;
	private String name;
	private String completionDate;
	
	public Certification() {
		this.id=5864;
		this.name="GitHub-Copilot";
		this.completionDate="3-12-2025";
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompletionDate() {
		return completionDate;
	}

}
