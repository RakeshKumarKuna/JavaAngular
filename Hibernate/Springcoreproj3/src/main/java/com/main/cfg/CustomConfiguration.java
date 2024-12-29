package com.main.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.main")
public class CustomConfiguration {

	@Bean
	public  Date getDateInstance() {
		return new Date();
	}
}
