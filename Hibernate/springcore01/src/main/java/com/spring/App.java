package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.beans.Student;
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/cfgs/ApplicationContext.xml");
		Student stu = (Student) context.getBean("student");
		stu.greet();

	}
}
