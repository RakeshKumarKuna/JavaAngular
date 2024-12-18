package com.Collections;
import static java.lang.System.out;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class Demo {
	public static void addition(int ...data) {
	   System.out.println(data);
	}

	public static void main(String[] args) throws IOException {
		addition(4,54,84,45,98,45);
	   Integer id;
	   Boolean isEmpty=true;
        out.println("Demo.main()");
        List< Integer> list=new ArrayList<Integer>();
        Arrays.asList(list);
        list.add(45);
        list.add(5);
        list.add(45);
        list.add(45);
        list.set(0, 55);
        List.of(12,458,87,95,48,45);
        
        out.println(list);
        List<Integer> sublist=list.subList(0, 2);
        list.addAll(sublist);
        System.out.println(list);
        System.out.println();        
        ImmutableClass obj=new ImmutableClass();
        System.out.println(list); 
        
        Vector vector=new Vector();
        System.out.println("----------------------------------------");
        LinkedList< Integer> listlinked=new LinkedList<Integer>();
        listlinked.add(45);
        listlinked.add(85);       
        System.out.println(listlinked);          
	}

}
