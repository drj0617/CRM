package com.crm.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.beans.User;
import com.crm.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {

	@Autowired
	UserDao userDao;
	@Test
	public void test01() {
		User userByCodeAndPwd = userDao.getUserByCodeAndPwd("rose", "123");
		System.out.println(userByCodeAndPwd);
	}
	
	
}
