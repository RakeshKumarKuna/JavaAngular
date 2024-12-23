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
        Student stu=new Student();
        stu.setStuId(61);
        stu.setsName("surya");
        stu.setRollNo(956);
        ses.persist(stu);
        transaction.commit();
        System.out.println("record inserted");
        }
        catch(HibernateException ex) {
        	transaction.rollback();
        }
    }
}
