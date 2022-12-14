package com.gio.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gio.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create 3 student objects
			System.out.println("Creating new 3 student objects...");
			Student tempStudent = new Student("Gio", "Charkviani", "gio@gmail.com");
			Student tempStudent2 = new Student("John", "Doe", "john@gmail.com");
			Student tempStudent3 = new Student("Merry", "Pupper", "merry@gmail.com");

			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the students...");
			session.save(tempStudent);
			session.save(tempStudent2);
			session.save(tempStudent3);

			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");

		} finally {
			factory.close();
		}	

	}

}
