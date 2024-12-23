package com.main.Utilis;

import static org.hibernate.cfg.JdbcSettings.DRIVER;
import static org.hibernate.cfg.JdbcSettings.FORMAT_SQL;
import static org.hibernate.cfg.JdbcSettings.PASS;
import static org.hibernate.cfg.JdbcSettings.SHOW_SQL;
import static org.hibernate.cfg.JdbcSettings.URL;
import static org.hibernate.cfg.JdbcSettings.USER;
import static org.hibernate.cfg.SchemaToolingSettings.HBM2DDL_AUTO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utils {
   public static SessionFactory getSessionFactory() {
	   SessionFactory sf =new Configuration()
       		.addAnnotatedClass(com.main.entity.Student.class)
               .setProperty(URL, "jdbc:mysql://localhost:3306/rakesh")
               .setProperty(DRIVER, "com.mysql.cj.jdbc.Driver")
               .setProperty(USER, "root")
               .setProperty(PASS, "root")
               .setProperty(SHOW_SQL, true)
               .setProperty(FORMAT_SQL, true)
               .setProperty(HBM2DDL_AUTO, "create")
               .buildSessionFactory();
     return sf;
   }
}
