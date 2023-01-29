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
		
		// create a query .. sort by last name
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
		
		// return the results
		return customers;
	}
	
	@Override
	public void saveCustomer(Customer theCustomer) {
		// get current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// save or update the customer .. finally
		session.saveOrUpdate(theCustomer);
	}
	
	@Override
	public Customer getCustomer(int theId) {
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, theId);
		
		return customer;
	}
	
	@Override
	public void deleteCustomer(int theId) {
		Session session = sessionFactory.getCurrentSession();
		
		Query theQuery = session.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
	}

}
