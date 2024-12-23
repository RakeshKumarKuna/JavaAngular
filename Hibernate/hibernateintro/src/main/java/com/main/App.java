package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.main.entity.Student;


class App {
    public static void main(String[] args) {
      
        Configuration conifg=new Configuration();
        conifg.configure("com/main/cfgs/hibernate.cfg.xml");
        SessionFactory sf= conifg.buildSessionFactory();
        Session ses= sf.openSession();
        Transaction transaction=ses.beginTransaction();
      try {
        Student stu=new Student();
        stu.setStuId(61);
        stu.setsName("surya");
        stu.setRollNo(956);
        ses.save(stu);
        transaction.commit();
        System.out.println("record inserted");
        }
        catch(HibernateException ex) {
        	transaction.rollback();
        }
    }
}
