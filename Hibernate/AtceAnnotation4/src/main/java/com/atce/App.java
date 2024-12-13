package com.atce;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atce.entity.PhoneNumbers;
import com.atce.entity.Student;
import com.atce.util.Utils;

public class App {
    public static void main(String[] args) {
       Utils.config();
      SessionFactory sf= Utils.getSessionFactory();
      Session ses= Utils.getSession();
    	Transaction transaction= ses.beginTransaction();
       try {
    	   Student st=new Student();
           st.setStudentName("jebin");
           st.setSchoolName("ssgm");
           PhoneNumbers ph1=new PhoneNumbers();
           ph1.setPhoneNumber(9815468454l);
           PhoneNumbers ph2=new PhoneNumbers();
           ph2.setPhoneNumber(981768454l);
           st.setStudentPhoneNumber(List.of(ph1,ph2));
           ses.save(st);
           transaction.commit();  
       }catch (HibernateException e) {
    	   //transaction.rollback();
    	   e.printStackTrace();
	  }
       catch(Exception e) {
    	   //transaction.rollback();
    	   e.printStackTrace();
       }
     
        System.out.println("record inserted");
    }
}
