package com.gio.spring;

import org.springframework.stereotype.Component;

@Component("restFortuneService")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Why you so luck REST lucky baby?";
	}

}
