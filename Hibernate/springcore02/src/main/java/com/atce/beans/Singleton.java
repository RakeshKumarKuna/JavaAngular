package com.atce.beans;

public class Singleton {

	public static Singleton getInstance() {
		return new Singleton(); 
	}  
}
