package com.gio.spring;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run back and forth right now, you stupid idiot";
	}
	

}
