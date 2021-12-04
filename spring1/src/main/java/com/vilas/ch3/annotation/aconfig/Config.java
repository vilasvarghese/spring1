package com.vilas.ch3.annotation.aconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean //Same as @Bean(name="employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
}
