package com.atce;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.atce.entity.Student;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("com/atce/cfgs/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction transaction= ses.beginTransaction();
        Student st=new Student();
        st.setStudentId(100);
        st.setStudentName("rakesh");
        st.setSchoolName("ssgm");
        ses.save(st);
        transaction.commit();   
        System.out.println("record inserted");
    }
}
