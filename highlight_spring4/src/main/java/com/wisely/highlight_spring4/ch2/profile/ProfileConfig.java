package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev") //1
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile");
	}

	@Bean
	@Profile("prod") //2
	public DemoBean prodDemoBean() {
		return new DemoBean("from production profile");
	}

}
