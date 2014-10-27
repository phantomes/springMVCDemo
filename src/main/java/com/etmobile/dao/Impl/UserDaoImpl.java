package com.etmobile.dao.Impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.etmobile.dao.UserDaoI;
import com.etmobile.model.TabUser;

@Repository("userDao")
public class UserDaoImpl implements UserDaoI {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(TabUser user) {
		sessionFactory.getCurrentSession().save(user);
	}

}
