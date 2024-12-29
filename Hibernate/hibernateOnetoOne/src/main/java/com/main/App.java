package com.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.main.Utilis.Utils;
import com.main.entity.PanCard;
import com.main.entity.Person;
class App {
	public static void main(String[] args) {
		SessionFactory sf = Utils.getSessionFactory();
		sf.getSchemaManager().truncateMappedObjects();
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		try {
		  Person per=new Person();
		  per.setPerName("surya");
		  PanCard pan=new PanCard();
		  pan.setCardNo("hry4578m");
		  pan.setPerson(per);
		  per.setPan(pan);
			ses.persist(per);
			transaction.commit();
			System.out.println("record inserted");
		} catch (HibernateException ex) {
			transaction.rollback();
		}
	}
}
