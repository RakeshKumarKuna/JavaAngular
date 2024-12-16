package com.hibernatedoc;
import org.hibernate.SessionFactory;
import com.hibernatedoc.Utils.Utils;
import com.hibernatedoc.entity.Book;

public class App {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	
		SessionFactory sf = Utils.getSessionFactory();
		Book bk = new Book();
		bk.setTitle("life");
		sf.inTransaction(session -> {
			session.persist(bk);
		});
	}
}
