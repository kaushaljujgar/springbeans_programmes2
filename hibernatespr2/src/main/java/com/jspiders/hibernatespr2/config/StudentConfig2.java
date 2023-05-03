package com.jspiders.hibernatespr2.config;



import org.springframework.context.annotation.Bean;


import com.jspiders.hibernatespr2.beans.Student2;

public class StudentConfig2 {
  @Bean("student1")
	public Student2 getStudent1() {
		return new Student2(1,"rahul","rahul@gmail.com","Beed");
	}
}
