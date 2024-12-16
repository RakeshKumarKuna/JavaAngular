package com.hibernatedoc.Utils;
import static org.hibernate.cfg.AvailableSettings.DRIVER;
import static org.hibernate.cfg.AvailableSettings.FORMAT_SQL;
import static org.hibernate.cfg.AvailableSettings.HBM2DDL_AUTO;
import static org.hibernate.cfg.AvailableSettings.PASS;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;
import static org.hibernate.cfg.AvailableSettings.URL;
import static org.hibernate.cfg.AvailableSettings.USER;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernatedoc.entity.Book;

public class Utils {
public static SessionFactory getSessionFactory() {
	return  new Configuration().addAnnotatedClass(Book.class)
			.setProperty(DRIVER, "com.mysql.cj.jdbc.Driver")
			.setProperty(URL, "jdbc:mysql://localhost:3306/rakesh")
			.setProperty(USER, "root")
			.setProperty(PASS, "root")
			.setProperty(SHOW_SQL, "true")
			.setProperty(FORMAT_SQL, "true")
			.setProperty(HBM2DDL_AUTO, "update")
			.buildSessionFactory();
}
}
