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
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		try {
			Person per = new Person();
			per.setPname("surya");
			PhoneNumbers ph1 = new PhoneNumbers();
			ph1.setPhno(789451547l);
			PhoneNumbers ph2 = new PhoneNumbers();
			ph2.setPhno(957451547l);
			per.setPhno(Set.of(ph1, ph2));
			ses.persist(per);
			transaction.commit();
			ses.get(Person.class, 1);
			System.out.println("record inserted");
		} catch (HibernateException ex) {
			transaction.rollback();
		}
	}
}
