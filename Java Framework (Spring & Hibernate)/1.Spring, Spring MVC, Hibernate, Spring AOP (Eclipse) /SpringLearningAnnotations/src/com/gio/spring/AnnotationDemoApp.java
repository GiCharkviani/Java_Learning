package com.gio.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
				
		// call a methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// set data
		System.out.println(coach.getDailyFortune());
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		
		// get data
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());

		
		// close the context
		context.close();

	}

}
