package com.acte.service;

/**
 * 
 * @author RakeshKumarKuna
 *
 */
public class Vechile {
	int id;
	String name = "surya"; // instance variable
	{
		System.out.println("instance block"); // instance block
	}

	public Vechile() {
		System.out.println("0 -param constucter");
	}

	public int wheels(String type) { // instace method
		String name = "rakesh"; // local
		System.out.println(name); //
	   return type=="two"?2:4;     //ternary operator	
	}
	
	public static  void  method1() {
		System.out.println("static");
	}

}
/*
 * multiline comments
 */