package com.atce;

import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.atce.entity.Person_annotation;
import com.atce.entity.PhoneNumber_annotation;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("com/atce/cfgs/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction transaction= ses.beginTransaction();;
       try {
    	Person_annotation per=new Person_annotation();
    	per.setName("raeksh");
    	PhoneNumber_annotation ph1=new PhoneNumber_annotation();
    	ph1.setPhno(7035924587l);
      	PhoneNumber_annotation ph2=new PhoneNumber_annotation();
    	ph2.setPhno(964559587l);
    	per.setPhno(Set.of(ph1));
    	  ses.save(per);
           transaction.commit();
           System.out.println("record inserted");
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
     
    }
}
