package com.main.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sb")
public class SpringBean {
	@Autowired
	private Date date;
	public void greet() {
		System.out.println("Hello Spring "+date);
	}
 }
