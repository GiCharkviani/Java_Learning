package com.gio.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.gio.spring") // will scan all components on a given package
@PropertySource("classpath:chess.coach")
public class SportConfig {
	
	// define bean for our sad fortune service (The same as what we specify in qualifier)
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	// define bean for our chess coach AND inject dependency
	@Bean
	public Coach chessCoach() {
		return new ChessCoach(sadFortuneService());
	}

}
