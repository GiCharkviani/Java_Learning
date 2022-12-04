package com.gio.spring;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public String getTeam() {
		return this.team;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Cricekt now now I said nowwww";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
