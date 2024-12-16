package com.hibernatedoc.Utils;
import java.util.List;
import org.hibernate.Session;
import com.hibernatedoc.entity.Book;

import jakarta.persistence.NamedQuery;
@NamedQuery(name = "getallrecords", query = "select * from book")
public class QueryUtils {

	public static List<Book> getAllBookRecords(Session session) {
		return session.createNamedSelectionQuery("getallrecords", Book.class).getResultList();
	}

}
