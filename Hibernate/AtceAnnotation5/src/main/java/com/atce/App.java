package com.atce;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.atce.entity.Book;
import com.atce.entity.Publisher;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("com/atce/cfgs/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction transaction= ses.beginTransaction();;
       try {
    	  Publisher pub=new Publisher();
    	  pub.setPublisherName("rakesh");
    	  Book book1=new Book();
    
    	  book1.setBookName("about life");
    	 book1.setPublisher(pub);
    	 book1.setPublisher(pub);
//    	  Book book2=new Book();
//    	  book2.setBookName("about death");
//    	 book2.setPublisher(pub);
//    	 // pub.setBook(List.of(book1,book2));
    	  ses.save(book1);
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
