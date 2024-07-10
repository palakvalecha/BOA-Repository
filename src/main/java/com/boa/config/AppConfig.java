package com.boa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.service.CustomerImpl;
import com.boa.service.CustomerService;
import com.boa.service.HelloWorld;
import com.boa.service.HelloWorldImp;

@Configuration
public class AppConfig {
	@Bean(name="helloBean") 
	public HelloWorld helloWorld() { return new
	 HelloWorldImp(); }
	 

}
