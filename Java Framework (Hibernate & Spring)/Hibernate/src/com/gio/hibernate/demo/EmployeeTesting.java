package com.gio.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gio.hibernate.demo.entity.Employee;

public class EmployeeTesting {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg2.xml")
										.addAnnotatedClass(Employee.class)
										.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {		
			
			session.beginTransaction();
			
			Employee someEmployee = session.get(Employee.class, 2);

			session.delete(someEmployee);
			
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}

	}

}
