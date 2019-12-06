package com.example.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.project.userservice.UserService;
import com.example.project.userservice.UserServiceImpl;

@Configuration
public class Config {
	
	@Bean
	UserService userService() {
		return new UserServiceImpl();
	}
	

}
