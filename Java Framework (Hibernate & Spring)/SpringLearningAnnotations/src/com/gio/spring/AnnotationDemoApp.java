package com.gio.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach coach = context.getBean("footballCoach", Coach.class);
		
		// call a method on the bean
		System.out.print(coach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
