package com.controller;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dbconfig.DbConfig;
import com.model.User;

public class UserController {

	public static void addUser(User u) {
		
		Session session=DbConfig.getConnection();
		Transaction tx=session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
		
	}
	
	public static List<User> getAll(){
		Session session=DbConfig.getConnection();
		Transaction tx=session.beginTransaction();
		List<User> userList=session.createCriteria(User.class).list();
		tx.commit();
		session.close();
		return userList;
	}

	public static User getUser(int id) {
		Session session=DbConfig.getConnection();
		Transaction tx=session.beginTransaction();
		User u=(User) session.get(User.class, id);
		tx.commit();
		session.close();
		return u;
	}

	public static void deleteUser(User u) {
		Session session=DbConfig.getConnection();
		Transaction tx=session.beginTransaction();
		session.delete(u);
		tx.commit();
		session.close();
	}

	public static void updateUser(User u) {
		Session session=DbConfig.getConnection();
		Transaction tx=session.beginTransaction();
		session.update(u);
		tx.commit();
		session.close();
	}

	public static int loginUser(User u) {
		Session session=DbConfig.getConnection();
		Transaction tx=session.beginTransaction();
		
		User user=(User) session.createQuery("from User where username='"+u.getUsername()+"' and password='"+u.getPassword()+"'").uniqueResult();
		if(user!=null) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
  