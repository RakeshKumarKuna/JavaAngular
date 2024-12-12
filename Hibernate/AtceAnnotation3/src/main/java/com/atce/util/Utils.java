package com.atce.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Utils {
	static Configuration config;
	static SessionFactory sf;
	static Session ses;
	Transaction transaction;

	public static void config() {
		config = new Configuration();
		config.configure("com/atce/cfgs/hibernate.cfg.xml");
	}
   public static SessionFactory getSessionFactory() {
	   sf= config.buildSessionFactory();
	   return sf;
   }
   public static Session getSession() {
	   ses=sf.openSession();
	   return ses;
   }
}
