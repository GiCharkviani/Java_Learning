package com.gio.spring;

public class HappyFortuneService implements FortuneService {
	
	private final String[] fortunes = {"You are fucking lucky", "How come you are so lucky?", "You are luckier than the sun"};

	@Override
	public String getFortune() {
		int randomNumber = (int) (Math.random() * 3);
		return this.fortunes[randomNumber];
	}

}
