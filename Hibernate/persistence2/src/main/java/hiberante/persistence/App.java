package hiberante.persistence;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.persistence.entity.Animal;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Configuration config=new Configuration();
        config.configure("hibernate/persistence/cfg/hibernate.cfg.xml");
        System.out.println(config.getProperties());
        SessionFactory sf=config.buildSessionFactory();
        Session ses=sf.openSession();
       org.hibernate.Transaction trans=ses.beginTransaction();
       for(int i=1;i<=5;i++) {
        Animal obj=new Animal();
        System.out.println("enter the animal name");
        String animalName=new Scanner(System.in).nextLine();
        obj.setId(i);
        obj.setName(animalName);
        String s="";
        ses.save(obj);
       }
       trans.commit();
         System.out.println("record inserted");
        sf.close();
         ses.close();
    }
}
