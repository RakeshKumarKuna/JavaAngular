package com.atce.beans;

public class Singleton {
	public Singleton() {
	}
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Singleton [id=" + id + ", name=" + name + "]";
	}	
//	public Singleton(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}

	private static final  Singleton singleton=new Singleton();
  public static Singleton getInstance() {
		return singleton; 
	}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}  
}
