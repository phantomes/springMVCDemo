package com.etmobile.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etmobile.dao.UserDaoI;
import com.etmobile.model.TabUser;
import com.etmobile.service.UserServiceI;

@Service(value = "userService")
public class UserServiceImpl implements UserServiceI {
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDaoI userDao;

	@Override
	public void save(TabUser user) {
		userDao.addUser(user);	
	}

}
