package com.atce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.atce.beans.Greeting;
import com.atce.cfgs.CustomConfigration;
public class App {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomConfigration.class);
		Greeting greet = context.getBean("greet", Greeting.class);
		greet.greet();
	}
}
