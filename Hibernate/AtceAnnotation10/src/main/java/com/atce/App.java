package com.atce;

import java.util.LinkedList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.atce.entity.Student;
import com.atce.repositary.HQL;

public class App {
	 static  Student st;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("com/atce/cfgs/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction transaction= ses.beginTransaction();
       try {
    	   for(int i=0;i<=10;i++) {
    	   Student st=new Student();
           st.setStudentName("jebin");
           st.setSchoolName("ssgm");
           ses.persist(st);
    	   }
         //  st= ses.get(Student.class, 5) ; 
           //ses.remove(st);
           st.setStudentName("rakesh");
           
           ses.persist(st);
          // Query<List<Student>> q=ses.createNamedQuery("select * from student_table where studentId=5");
           ses.clear();
          transaction.commit();  
       }catch (HibernateException e) {
    	   transaction.rollback();
    	   e.printStackTrace();
	  }
       catch(Exception e) {
    	   transaction.rollback();
    	   e.printStackTrace();
       }
       finally {
    	   sf.close();
    	   ses.close();
	}      
        System.out.println("record inserted");
        System.out.println(st.toString());
    }
	
}
