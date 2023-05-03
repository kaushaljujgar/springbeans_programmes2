package com.jspiders.hibernatespr2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.hibernatespr2.beans.Student2;
import com.jspiders.hibernatespr2.config.StudentConfig2;

public class Student2Main {
	
public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig2.class);
		
		Student2 student1=(Student2)context.getBean("student1");
		
		System.out.println(student1);
		
		((AnnotationConfigApplicationContext)context).close();
	}
	

}
