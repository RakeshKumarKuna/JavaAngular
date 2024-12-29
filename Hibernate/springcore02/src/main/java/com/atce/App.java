package com.atce;

import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.atce.beans.Greeting;
import com.atce.beans.Singleton;
public class App {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atce/cfgs/ApplicationContext.xml");
		Greeting greet = context.getBean("greet", Greeting.class);
		Greeting greet1 = context.getBean("greet", Greeting.class);
		System.out.println(greet);
		System.out.println(greet1);
		System.out.println();
		greet.greet();
		System.out.println("********************");
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println("********************");
		Date dt = context.getBean("dt", Date.class);
		System.out.println(dt);
        //Singleton sing=new Singleton(45, "jebin");
        //System.out.println(sing);
		// Singleton sing=context.getBean("single",Singleton.class);
		// System.out.println(sing);
		System.out.println("****************************");
		Singleton sing1 = context.getBean("single", Singleton.class);
		System.out.println(sing1);
	}
}
