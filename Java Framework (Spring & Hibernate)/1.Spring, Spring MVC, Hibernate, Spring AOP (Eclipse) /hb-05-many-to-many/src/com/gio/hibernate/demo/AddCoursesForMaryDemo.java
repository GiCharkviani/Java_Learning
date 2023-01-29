package com.gio.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gio.hibernate.demo.entity.Course;
import com.gio.hibernate.demo.entity.Instructor;
import com.gio.hibernate.demo.entity.InstructorDetail;
import com.gio.hibernate.demo.entity.Review;
import com.gio.hibernate.demo.entity.Student;

public class AddCoursesForMaryDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.addAnnotatedClass(Course.class)
										.addAnnotatedClass(Review.class)
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// start a transaction
			session.beginTransaction();
			
			// get the student Mary from database
			int meryId = 2;
			
			Student mery = session.get(Student.class, meryId);
			
			
			System.out.println("\nLoaded Mery: " + mery);
			System.out.println("\nMery's courses: " + mery.getCourses());

			// create more courses
			Course course1 = new Course("Rubik's Cube - How to Speed Cube");
			Course course2 = new Course("Atari 2600 - Game Development");

			// add student to courses
			course1.addStudent(mery);
			course2.addStudent(mery);
			
			// save the courses
			System.out.println("\nSaving the courses ...");
			
			session.save(course1);
			session.save(course2);


			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");

		} finally {
			// add clean up code
			session.close();
			
			factory.close();
		}

	}

}
