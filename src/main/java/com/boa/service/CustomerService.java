package com.boa.service;

import java.util.List;

import com.boa.model.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	Customer getCustomer(int id);
	List<Customer> getAllCustomers();
	
}
