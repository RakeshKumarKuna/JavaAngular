package com.acte.service;

public class MethodOverLoading {

	 public int addition(int a,int b) {
		 return a+b;
	 }
	 public int addition(int a,int b,int c) {
		 return a+b+c;
	 }	
	public static void main(String[] args) {
		MethodOverLoading name = new MethodOverLoading();
        name.addition(5, 6);
        name.addition(2, 4,9);
	}

}
