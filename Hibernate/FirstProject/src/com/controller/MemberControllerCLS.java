package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Modal.MemberModal;


public class MemberControllerCLS {

//	public MemberControllerCLS(MemberModal MM) {
//		// TODO Auto-generated constructor stub
//	}

	public static void addMember(MemberModal MM) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(MM);
		tx.commit();
		session.close();
		
	}
	
}