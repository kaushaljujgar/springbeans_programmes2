package com.jspiders.hibernatespr2.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Student3 {

     @Value("1")
	private int id;
     @Value("kaushal")
	private String name;
     @Value("kaushal@gmail.com")
	private String email;
     @Value("Beed")
	private String city;
}
