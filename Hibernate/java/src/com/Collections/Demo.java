package com.Collections;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
public class Demo {
	public static void addition(int ...data) {
	   System.out.println(data);
	}

	public static void main(String[] args) {
		addition(4,54,84,45,98,45);
	   Integer id;
	   Boolean isEmpty=true;
        out.println("Demo.main()");
        List< Integer> list=new ArrayList();
        list.add(45);
        list.add(45);
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
	}

}
