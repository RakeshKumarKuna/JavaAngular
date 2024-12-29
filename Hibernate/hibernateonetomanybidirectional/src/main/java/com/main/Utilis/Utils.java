package com.main.Utilis;

import org.hibernate.SessionFactory;
import  org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.schema.Action;
public class Utils {
   public static SessionFactory getSessionFactory() {
	   SessionFactory sf =new Configuration()
       		.addAnnotatedClass(com.main.entity.Person.class)
       		.addAnnotatedClass(com.main.entity.PhoneNumbers.class)
               .setProperty(AvailableSettings.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/rakesh")
               .setProperty(AvailableSettings.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver")
               .setProperty(AvailableSettings.JAKARTA_JDBC_USER, "root")
               .setProperty(AvailableSettings.JAKARTA_JDBC_PASSWORD, "root")
               .setProperty(AvailableSettings.SHOW_SQL, true)
               .setProperty(AvailableSettings.FORMAT_SQL, true)
               .setProperty(AvailableSettings.HBM2DDL_AUTO,Action.ACTION_UPDATE)
               .buildSessionFactory();
     return sf;
   }
}
