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
   System.out.println(set);
   System.out.println("----------------------");
   Set<Integer> treeSet=new TreeSet();
   treeSet.add(45);
   treeSet.add(84);
   treeSet.add(49);
   treeSet.add(77);
   System.out.println(treeSet);
   
	}

}
