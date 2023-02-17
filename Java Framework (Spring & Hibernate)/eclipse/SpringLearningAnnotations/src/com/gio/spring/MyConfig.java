package com.gio.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean
	public FortuneService lazyFortuneService() {
		return new LazyFortuneService();
	}
	
	@Bean
	public MyCoach myCoach() {
		return new MyCoach(lazyFortuneService());
	}
	
}
