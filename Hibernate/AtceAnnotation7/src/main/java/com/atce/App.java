package com.atce;

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
		Configuration config = new Configuration();
		config.configure("com/atce/cfgs/hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		sf.getSchemaManager().truncateMappedObjects();
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		
		try {
			Person_annotation per = new Person_annotation();
			per.setName("rakesh");

			PhoneNumber_annotation ph1 = new PhoneNumber_annotation();
			ph1.setPhno(7035924587l);
			ph1.setPerson(per);
			PhoneNumber_annotation ph2 = new PhoneNumber_annotation();
			ph2.setPhno(964559587l);
			ph2.setPerson(per);
			per.setPhno(Set.of(ph1, ph2));
			ses.save(per);
			transaction.commit();
			System.out.println("record inserted");
			PhoneNumber_annotation phobj = ses.get(PhoneNumber_annotation.class, 1);
			System.out.println(phobj.toString());
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {

		}

	}
}
