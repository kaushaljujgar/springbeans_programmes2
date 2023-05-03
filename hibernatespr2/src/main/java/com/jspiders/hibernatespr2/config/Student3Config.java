package com.jspiders.hibernatespr2.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.hibernatespr2.beans.Student3;

public class Student3Config {
	@Bean
	private Student3 getStudent1() {
		return new Student3();
	}
}
