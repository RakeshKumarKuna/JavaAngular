package hiberante.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.persistence.entity.Animal;

public class SelectOperation {

	public static void main(String[] args) {
		   Configuration config=new Configuration();
	        config.configure("hibernate/persistence/cfg/hibernate.cfg.xml");
	        SessionFactory sf=config.buildSessionFactory();
	        Session ses=sf.openSession();
	       org.hibernate.Transaction trans=ses.beginTransaction();
			/*
			 * Animal obj2=new Animal(); obj2.setName("dog");
			 */
          // ses.save(obj2);
	      Animal obj= ses.get(Animal.class, 0);
	      
	      System.out.println(obj.toString());
         trans.commit();
           //Animal getAnimalDetailes=ses.get(Animal.class, 1);
           
           
	}

}
