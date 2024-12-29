package com.atce;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.atce.entity.DayOfWeek;
import com.atce.entity.Student;

public class App {
	static Student st;
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration config = new Configuration();
		config.configure("com/atce/cfgs/hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		try {
			for (int i = 0; i <= 10; i++) {
				Student st = new Student();
				st.setStudentName("jebin");
				st.setSchoolName("ssgm");
				st.setBirthDay(DayOfWeek.SUNDAY);
				ses.persist(st);
			}
			Query<Student> query=ses.createQuery("from Student WHERE studentId=503", Student.class);
			query.getResultList().forEach(data->{
				System.out.println(data);
			});
			transaction.commit();
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
		System.out.println("record inserted");
	}
}
