package com.gio.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gio.hibernate.demo.entity.Course;
import com.gio.hibernate.demo.entity.Instructor;
import com.gio.hibernate.demo.entity.InstructorDetail;

public class FetchJoinDemo {

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
			
			
			// get the instructor from db
			int id = 1;
			Instructor tempInstructor = session.get(Instructor.class, id);
			
			System.out.println("Instructor: " + tempInstructor);
			
			System.out.println("\nluv2code: Courses: " + tempInstructor.getCourses() + "\n");

			
			session.getTransaction().commit();
			
			// close session
			session.close();
			
			System.out.println("luc2code: The session is now closed!\n");
			// option1: call getter method while is open
			
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
