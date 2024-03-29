package com.gio.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gio.hibernate.demo.entity.Course;
import com.gio.hibernate.demo.entity.Instructor;
import com.gio.hibernate.demo.entity.InstructorDetail;
import com.gio.hibernate.demo.entity.Review;

public class DeleteCourseAndReviewsDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.addAnnotatedClass(Course.class)
										.addAnnotatedClass(Review.class)
										.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// start a transaction
			session.beginTransaction();
			
			// get the course
			int id = 10;
			
			Course tempCourse = session.get(Course.class, id);
			
			// print the course
			System.out.println("Course: " + tempCourse);
			
			// print the course reviews
			System.out.println("Reviews: " + tempCourse.getReviews());
			
			// delete the course
			session.delete(tempCourse);

			
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
