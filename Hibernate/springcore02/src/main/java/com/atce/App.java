package com.atce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atce.beans.Greeting;

public class App {

	public static void main(String[] args) {
   System.out.println("hello");
   ApplicationContext context=new ClassPathXmlApplicationContext("com/atce/cfgs/ApplicationContext.xml");
   Greeting greet=context.getBean("greet",Greeting.class);
   System.out.println(greet);
   greet.greet();
   System.out.println("********************");
	}
}
