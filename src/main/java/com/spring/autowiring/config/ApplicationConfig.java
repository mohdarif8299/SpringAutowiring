package com.spring.autowiring.config;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.autowiring.beans.Address;
@Configuration
@ComponentScan("com.spring.autowiring")
@Scope("prototype")
public class ApplicationConfig {
	@Bean
	@Qualifier("address1")
	@Scope("prototype")
	public Address getBean(){
		return new Address();
	}
	@Bean
	@Qualifier("address2")
	@Scope("prototype")
	public Address getBean2(){
		return new Address();
	}
}
