package com.etmobile.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etmobile.model.TabUser;
import com.etmobile.service.UserServiceI;

public class Springtest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Springtest.class);

	private ApplicationContext ac;

	@Before
	public void initApplicationContext() {
		ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring-mvc.xml", "classpath:spring-hibernate.xml" });
	}

	@Test
	public void testHibernate() {
		logger.info("dddddddddddd");
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		TabUser user = new TabUser();
		user.setName("cpp");
		user.setPassword("1123");
		user.setTextKk("hhaaaaaaaaaaaaaaacpp");
		user.setCreateDate(new Date());
		userService.save(user);
	}
}
