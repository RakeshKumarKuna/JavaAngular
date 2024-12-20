package com.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<Integer> set=new HashSet();
   set.add(45);
   set.add(84);
   set.add(95);
   set.add(84);
   //System.out.println(set);
  set.forEach(value->{
	  System.out.println(value);
  });
   set.stream().filter(data->data%2==0).forEach(System.out::print);
	}
}
