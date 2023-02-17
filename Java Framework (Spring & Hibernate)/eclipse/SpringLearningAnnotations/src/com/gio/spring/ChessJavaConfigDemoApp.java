package com.gio.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChessJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// use spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach coach = context.getBean("chessCoach", Coach.class);
		
		// call a methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// set data
		System.out.println(coach.getDailyFortune());
		
		
		ChessCoach chessCoach = context.getBean("chessCoach", ChessCoach.class);
		// get data
		System.out.println("Email: " + chessCoach.getEmail());
		System.out.println("Team: " + chessCoach.getTeam());

		
		// close the context
		context.close();

	}

}
