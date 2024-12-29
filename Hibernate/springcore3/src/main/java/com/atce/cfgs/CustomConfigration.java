package com.atce.cfgs;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.atce")
public class CustomConfigration {
    @Bean
	public Date date() {
    	return new Date();
    }
}
