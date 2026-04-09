package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.Student;

public class MainApp {
	public static void main(String args[]) {
	
	ApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
	Student s=c.getBean(Student.class);
	s.display();
	}	

}
