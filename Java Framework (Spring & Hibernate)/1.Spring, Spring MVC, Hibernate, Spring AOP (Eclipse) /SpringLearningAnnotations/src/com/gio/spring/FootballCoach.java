package com.gio.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public FootballCoach() {
		System.out.println(">> FootballCoach: inside default constructor");
	}
	
//	@Autowired
//	public FootballCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Run back and forth right now, you stupid idiot";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	

}
