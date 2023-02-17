package com.gio.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	
	private String[] data = {
			"Beware of the wolf in sheep's clothng",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
