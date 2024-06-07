package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entertainment.entity.Movie;

public class RecordInsertionExampleMain {
	public static void main(String[] args) {
		// step1
		Configuration hibernateconfig = new Configuration();
		hibernateconfig = hibernateconfig.configure();
		// step2
		SessionFactory hibernateFactory = hibernateconfig.buildSessionFactory();
		// step3
		Session hibernatSession = hibernateFactory.openSession();
		// step4
		Movie movieObj = new Movie(101, "heraferi", "comedy", 2012);
		// step5
		Transaction hibernateTransaction = hibernatSession.beginTransaction();
		// step6
		hibernatSession.persist(movieObj);
		//step7
		hibernateTransaction.commit();
		//step8
		hibernatSession.close();
		//step9
		hibernateFactory.close();
		
		System.out.println("Record insertad");

	}
}
