package com.gio.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.gio.hibernate.demo.entity.Course;
import com.gio.hibernate.demo.entity.Instructor;
import com.gio.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.addAnnotatedClass(Course.class)
										.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// start a transaction
			session.beginTransaction();
			
			
			// option2: Hibernate query with HQL
			
			
			// get the instructor from db
			int id = 1;
			
			Query<Instructor> query = session.createQuery("SELECT i FROM Instructor i "
					+ "JOIN FETCH i.courses "
					+ "WHERE i.id=:theInstructorId", 
					Instructor.class);
			
			// set parameter on query
			query.setParameter("theInstructorId", id);
			
			// execute query and get instructor
			Instructor tempInstructor = query.getSingleResult();
			
			System.out.println("Instructor: " + tempInstructor);
			
			
			session.getTransaction().commit();
			
			// close session
			session.close();
			
			System.out.println("luc2code: The session is now closed!\n");
			
			// get courses for the instructor
			System.out.println("luv2code: Courses: " + tempInstructor.getCourses() + "\n");
			
//			for(Course course: tempInstructor.getCourses()) {
//				System.out.println("luv2code: Course: " + course.getTitle());
//			}

			
			// commit transaction
//			session.getTransaction().commit();
			
			System.out.println("luv2code: Done!");

		} finally {
			// add clean up code
//			session.close();
			
			factory.close();
		}

	}

}
