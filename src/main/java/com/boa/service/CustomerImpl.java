package com.boa.service;

import java.util.ArrayList;
import java.util.List;

import com.boa.model.Customer;

public class CustomerImpl implements CustomerService{
	List<Customer> customers=new ArrayList<>();
	
	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	@Override
	public Customer getCustomer(int id) {
		for(int i=0; i<customers.size(); i++) {
			Customer temp = customers.get(i);
			if(temp.getId() == id)
				return temp;
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers(){
		return new ArrayList<>(customers);
	}
}
