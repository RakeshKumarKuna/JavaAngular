package com.atce;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.atce.entity.Student;
import com.atce.util.Utils;

public class App {
    public static void main(String[] args) {
       Utils.config();
      SessionFactory sf= Utils.getSessionFactory();
      Session ses= Utils.getSession();
    	Transaction transaction= ses.beginTransaction();
       try (ses){
    	   Student st=new Student();
           st.setStudentId(100);
           st.setStudentName("jebin");
           st.setSchoolName("ssgm");
           ses.save(st);
           transaction.commit();  
       }catch (HibernateException e) {
    	   transaction.rollback();
    	   e.printStackTrace();
	  }
       catch(Exception e) {
    	   transaction.rollback();
    	   e.printStackTrace();
       }
     
        System.out.println("record inserted");
    }
}
