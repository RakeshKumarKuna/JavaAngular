package com.atce;

import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.atce.entity.Passport;
import com.atce.entity.Person;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration config = new Configuration();
		config.configure("com/atce/cfgs/hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		;
		try {
			Person per = new Person();
			per.setName("rakesh");
			Passport passport = new Passport();
			passport.setPassportNum("78584958");
			passport.setPerson(per);
			ses.save(passport);
			transaction.commit();
			System.out.println("record inserted");
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			sf.close();
			ses.close();
		}

	}
}
