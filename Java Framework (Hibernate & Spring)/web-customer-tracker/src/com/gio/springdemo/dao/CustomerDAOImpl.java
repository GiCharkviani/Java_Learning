package com.gio.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gio.springdemo.entity.Customer;

@Repository // for sprint to be able to scan this class. it inherits from @Component, like @Controller
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired // DI
	private SessionFactory sessionFactory;
	

	@Override
	public List<Customer> getCustomers() {
		
		// get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Customer> theQuery = session.createQuery("from Customer", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
		
		// return the results
		
		return customers;
	}

}
