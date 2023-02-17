package com.gio.spring;

public class LazyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are such a lazy lucky bastard!";
	}

}
