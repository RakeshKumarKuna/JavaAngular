package com.spring.beans;

public class Student {
	private static Student st=new Student();
public void greet() {
	System.out.println("Student.greet()   HELLO THIS IS SPRING BEAN");
}

public static Student createInstance() {
	return st;
}
}
