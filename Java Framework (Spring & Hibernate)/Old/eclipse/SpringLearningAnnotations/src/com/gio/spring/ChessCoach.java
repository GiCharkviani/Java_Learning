package com.gio.spring;

import org.springframework.beans.factory.annotation.Value;

public class ChessCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public ChessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Shakhmat!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
