package com.spring.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.autowiring.beans.Student;
import com.spring.autowiring.config.ApplicationConfig;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}
}
