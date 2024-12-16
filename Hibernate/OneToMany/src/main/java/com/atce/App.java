package com.atce;

import java.util.Set;
import javax.management.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.atce.entity.Person;
import com.atce.entity.PhoneNumbers;
import jakarta.persistence.NamedQueries;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("com/atce/cfgs/hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction transaction= ses.beginTransaction();
        Person per=new Person();
        per.setpName("jebin");
        PhoneNumbers ph1=new PhoneNumbers();
        ph1.setPhno(89895487l);
        PhoneNumbers ph2=new PhoneNumbers();
        ph2.setPhno(789485487l);
        per.setPhno(Set.of(ph1,ph2));
        ses.persist(per);
        System.out.println("record inserted");
        Person person=ses.load(Person.class,1);
       System.out.println("*********" +person.getClass());
        transaction.commit();     
    }
}
