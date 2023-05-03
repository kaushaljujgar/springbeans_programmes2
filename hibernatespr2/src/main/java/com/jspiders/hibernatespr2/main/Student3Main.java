package com.jspiders.hibernatespr2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.hibernatespr2.beans.Student3;
import com.jspiders.hibernatespr2.config.Student3Config;

public class Student3Main {
 
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Student3Config.class);
		
		Student3 student1=context.getBean(Student3.class);
		
		System.out.println(student1);
		
	((AnnotationConfigApplicationContext)context).close();
		
		
	}
}
