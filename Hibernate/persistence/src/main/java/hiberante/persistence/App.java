package hiberante.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.persistence.entity.Animal;
import jakarta.transaction.Transaction;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Configuration config=new Configuration();
       
        config.configure("hibernate/persistence/cfg/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
       org.hibernate.Transaction trans=ses.beginTransaction();
        Animal obj=new Animal();
        obj.setName("cat");
        String s="";
        ses.save(obj);
         trans.commit();
         System.out.println("record inserted");
    }
}
