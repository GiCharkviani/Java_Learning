package com.gio.spring;

public class MyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public MyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run as fast as possible";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
