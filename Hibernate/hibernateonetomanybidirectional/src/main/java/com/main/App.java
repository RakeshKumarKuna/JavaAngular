package com.main;

import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.main.Utilis.Utils;
import com.main.entity.Person;
import com.main.entity.PhoneNumbers;
class App {
	public static void main(String[] args) {
		SessionFactory sf = Utils.getSessionFactory();
		sf.getSchemaManager().truncateMappedObjects();
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		try {
		
			/*
			 * Person per = new Person(); per.setPname("surya"); PhoneNumbers ph1 = new
			 * PhoneNumbers(); ph1.setPhno(789451547l); PhoneNumbers ph2 = new
			 * PhoneNumbers(); ph2.setPhno(957451547l); per.setPhno(Set.of(ph1, ph2));
			 */
			PhoneNumbers ph1= new PhoneNumbers();
			ph1.setPhno(91259454l);
			Person per=new Person();
			per.setPname("rakesh");
			per.setPhno(Set.of(ph1));
			ph1.setPerson(per);
			ses.persist(ph1);
			transaction.commit();
			Person ph=ses.get(Person.class, 1);
			System.out.println(ph);
			System.out.println("record inserted");
		} catch (HibernateException ex) {
			transaction.rollback();
		}
	}
}