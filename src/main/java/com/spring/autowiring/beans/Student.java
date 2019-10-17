package com.spring.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	public Student(@Qualifier("address2") Address address){
	   System.out.println("Student Bean Created");
	}
}
