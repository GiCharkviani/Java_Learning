package com.gio.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gio.hibernate.demo.entity.Course;
import com.gio.hibernate.demo.entity.Instructor;
import com.gio.hibernate.demo.entity.InstructorDetail;
import com.gio.hibernate.demo.entity.Review;
import com.gio.hibernate.demo.entity.Student;

public class DeletePacmanCourseDemo {

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
			
			// get the pacman course from db
			int pacmanCourseID = 10;
			
			Course pacmanCoruse = session.get(Course.class, pacmanCourseID);
			
			System.out.println("\nLoaded the Pacman Course: " + pacmanCoruse);

			// delete the pacman course
			System.out.println("\nDeleting the Pacman Course...");
			session.delete(pacmanCoruse);
			
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
