package com.gio.springdemo.service;

import com.gio.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);
	
}
