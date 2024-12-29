package com.atce.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("greet")
public class Greeting {
	@Autowired
	private Date date;
public void greet() {
	System.out.println("Greeting.greet() "+date );
}
}
