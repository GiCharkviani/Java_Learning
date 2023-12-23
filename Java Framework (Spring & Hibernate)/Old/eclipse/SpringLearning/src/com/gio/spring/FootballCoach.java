package com.gio.spring;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run around the stadium";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
