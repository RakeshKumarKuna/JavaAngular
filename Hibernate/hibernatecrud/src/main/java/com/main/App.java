package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.main.Utilis.Utils;
import com.main.entity.Student;
class App {
    public static void main(String[] args) {
    	SessionFactory sf=Utils.getSessionFactory();
        Session ses= sf.openSession();
        Transaction transaction=ses.beginTransaction();
      try {
    	  for(int i=0;i<=5;i++) {
        Student stu=new Student();
        stu.setsName("surya");
          
        ses.persist(stu);
    	  }
        System.out.println("record inserted");
        transaction.commit(); 
     
        }
        catch(HibernateException ex) {
        	transaction.rollback();
        }
    }
}
