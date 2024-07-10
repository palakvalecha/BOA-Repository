package com.boa.model;

public class Customer {
	int id;
	String name;
	String address;
	
	public Customer(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCustomerName() {
		return name;
	}
}
