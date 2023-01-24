package com.gio.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gio.springdemo.dao.CustomerDAOImpl;
import com.gio.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAOImpl customerDAO;
	
	@Override
	@Transactional // does all transactions stuff
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}
