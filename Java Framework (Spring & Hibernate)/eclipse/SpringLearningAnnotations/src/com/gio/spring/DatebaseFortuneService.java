package com.gio.spring;

import org.springframework.stereotype.Component;

@Component
public class DatebaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You lucky database!";
	}

}
