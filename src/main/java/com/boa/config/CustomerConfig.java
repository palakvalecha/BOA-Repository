package com.boa.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import com.boa.service.CustomerImpl;
import com.boa.service.CustomerService;

@Configuration
public class CustomerConfig {
	@Bean(name="customerBean")
	public CustomerService customerService() {
		return new CustomerImpl();
	}

}
