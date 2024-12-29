package com.atce;

import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.atce.entity.Docter;
import com.atce.entity.Paitent;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("com/atce/cfgs/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
    	sf.getSchemaManager().truncateMappedObjects();
        Session ses=sf.openSession();
        Transaction transaction= ses.beginTransaction();;
       try {
       Docter doc=new Docter();
       Docter doc1=new Docter();
       doc.setName("jebin");
       doc1.setName("dhanu");
      
       Paitent pat=new Paitent();
       pat.setpName("rakesh");
       Paitent pat1=new Paitent();
       pat1.setpName("surya");
       pat.setDocter(Set.of(doc,doc1));
       doc1.setPaitent(Set.of(pat,pat1));
    	  ses.save(doc1);
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
