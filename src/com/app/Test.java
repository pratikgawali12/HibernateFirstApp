package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Student st1= new Student();
		st1.setStdId(101);
		st1.setStdName("pratik");
		st1.setStdFee(25000);
		st1.setStdAge(28);
		ses.save(st1);
		tx.commit();
		ses.close();

	}

}
