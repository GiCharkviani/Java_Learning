package com.gio.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyJavaConfigDemoApp {

	public static void main(String[] args) {
			
		// use spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		// get the bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// call a methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// set data
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
