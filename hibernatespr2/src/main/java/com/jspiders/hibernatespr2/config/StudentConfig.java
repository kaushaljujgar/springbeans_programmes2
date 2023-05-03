package com.jspiders.hibernatespr2.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.hibernatespr2.beans.Student;

public class StudentConfig {
	
	@Bean
	public Student getStudent() {
		Student student1=new Student();
		student1.setId(1);
		student1.setName("pavan");
		student1.setEmail("pavan@gmail.com");
		student1.setCity("Beed");
		return student1;
	}

}
