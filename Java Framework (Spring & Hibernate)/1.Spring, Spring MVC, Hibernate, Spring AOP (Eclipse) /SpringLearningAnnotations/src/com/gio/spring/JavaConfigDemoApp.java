package com.gio.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// use spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
				
		// call a methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// set data
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
