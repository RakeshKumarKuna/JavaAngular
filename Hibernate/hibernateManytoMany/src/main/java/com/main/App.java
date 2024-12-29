package com.main;

import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.main.Utilis.Utils;
import com.main.entity.Departments;
import com.main.entity.Employee;
class App {
	public static void main(String[] args) {
		SessionFactory sf = Utils.getSessionFactory();
		sf.getSchemaManager().truncateMappedObjects();
		Session ses = sf.openSession();
		Transaction transaction = ses.beginTransaction();
		try {
		Employee emp=new Employee();
		emp.setEmpName("surya");
		Departments dpts=new Departments();
		dpts.setDeptName("It");
		dpts.setEmps(Set.of(emp));
		emp.setDepts(Set.of(dpts));
			ses.persist(emp);
			transaction.commit();
			System.out.println("record inserted");
		} catch (HibernateException ex) {
			transaction.rollback();
		}
	}
}
