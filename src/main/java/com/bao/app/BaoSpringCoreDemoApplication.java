package com.bao.app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boa.config.AppConfig;
import com.boa.config.CentralizedConfig;
import com.boa.model.Customer;
import com.boa.service.CustomerService;
import com.boa.service.HelloWorld;

@SpringBootApplication
public class BaoSpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaoSpringCoreDemoApplication.class, args);
		System.out.println("new project");
		
		
		ApplicationContext context=SpringApplication.run(CentralizedConfig.class);
		
		//HelloWorld
		/*
		 * HelloWorld lookup = (HelloWorld) context.getBean("helloBean");
		 * 
		 * System.out.println(lookup.printDetails("BOA Training"));
		 */
		
		CustomerService customerService = (CustomerService) context.getBean("customerBean");
//		customerService((5,"a","A"),(6,"b","B"));
		Customer customer = new Customer(1, "Palak", "Mumbai");
		customerService.addCustomer(customer);
		
		customer =  new Customer(2, "Shweta", "Pune");
		customerService.addCustomer(customer);

		
		customerService.getAllCustomers().forEach(n ->
		{
			System.out.println(n.getCustomerName());		
		}
		);
		
	}

}

