package com.crm.service.imp;

import com.crm.beans.User;
import com.crm.dao.UserDao;
import com.crm.service.UserService;
import com.crm.utils.LoginException;

public class UserServiceImp implements UserService{

	private UserDao userDao;
	
	@Override
	public User getUserByCodeAndPwd(String code, String pwd) throws LoginException {

		User user = userDao.getUserByCodeAndPwd(code, pwd);
		
		
		if(user == null) {
			throw new LoginException("用户名不存在！");
		}
		if(!user.getUser_password().equals(pwd)) {
			throw new LoginException("密码错误！");
		}
		
		return user;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
}
