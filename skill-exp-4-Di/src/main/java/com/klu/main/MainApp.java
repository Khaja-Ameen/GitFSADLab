package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.Student;

public class MainApp {
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s=context.getBean(Student.class);
		s.display();
		
		ApplicationContext context1=new AnnotationConfigApplicationContext(AppConfig.class);
		Student s2=context1.getBean(Student.class);
		s2.display();
		
		
	}

}
