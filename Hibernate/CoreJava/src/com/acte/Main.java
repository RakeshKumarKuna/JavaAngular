package com.acte;
import com.acte.service.Lombok;
import com.acte.service.OopsEx;
import com.acte.service.StaticEx;     //cntl+shit+o

public class Main {
	
	public static void meth1() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
//     	Vechile name = new Vechile();
 //        int res=name.wheels("two");
//          //System.out.println(res);
//          Date date=new Date();
//          System.out.println(date);
     
	StaticEx obj= new StaticEx();
	  obj.score++;
      obj.id=100;
      obj.studentname="surya";
      StaticEx obj2= new StaticEx();
      obj2.id=101;
      obj2.studentname="rakesh";
      StaticEx obj3= new StaticEx();
      System.out.println(obj.id + " "+ obj.studentname +" "+ obj.schoolname+" "+obj.score);
      System.out.println(obj2.id + " "+ obj2.studentname +" "+ obj2.schoolname+" "+obj2.score);
      System.out.println(obj3.id + " "+ obj3.studentname +" "+ obj3.schoolname+" "+obj3.score);
     meth1();
     OopsEx obj4=new OopsEx(84,"");
     System.out.println();
     Lombok obj8=new Lombok();
     obj8.s
          
	}

}
