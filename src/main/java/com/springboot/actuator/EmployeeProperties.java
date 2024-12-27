package com.springboot.actuator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "employee")
@Data
public class EmployeeProperties 
{
	private String name;
	private Integer age;
}
