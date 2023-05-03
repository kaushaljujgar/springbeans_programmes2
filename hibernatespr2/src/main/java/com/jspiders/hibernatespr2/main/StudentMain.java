package com.jspiders.hibernatespr2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.hibernatespr2.beans.Student;
import com.jspiders.hibernatespr2.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student student1=context.getBean(Student.class);
		
		System.out.println(student1);
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
