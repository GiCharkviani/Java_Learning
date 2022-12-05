package com.gio.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	// instead of constructor or setter, you can autowire field (Java reflection technology)
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
//	@Autowired
//	public void doSomeCrazyStuff(@Qualifier("databaseFortuneService") FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	
//	@Autowired
//	public TennisCoach(@Qualifier("restFortuneService") FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
//	@PostConstruct
//	public void constructing() {
//		System.out.println("Constructing");
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Destroying");
//	}

}
