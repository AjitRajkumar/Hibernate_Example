package com.ajit.test;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Balaji");
		s1.setRollno(21);
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory ssf = con.buildSessionFactory();
		Session session = ssf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s1);
		System.out.println("Hello World!");
		Student test = session.get(Student.class, 12);
		System.out.println(test);
		tx.commit();
	}
}
