package com.springboot.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.actuator.beans.Student;

@SpringBootApplication
public class SpringBootActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorApplication.class, args);
	}
	
	@Bean
	public Student student()
	{
		return new Student();
	}
}
