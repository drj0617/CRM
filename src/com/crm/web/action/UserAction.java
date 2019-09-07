package com.crm.web.action;

import com.crm.beans.User;
import com.crm.service.UserService;
import com.crm.utils.LoginException;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private UserService userService;

	private User user = new User();
	
	public String login() throws LoginException {
		
		String user_code = user.getUser_code();
		String user_password = user.getUser_password();
//		System.out.println(user_code);
//		System.out.println(user_password);
		User userByCodeAndPwd = userService.getUserByCodeAndPwd(user_code, user_password);
//		System.out.println(user);
//		System.out.println(userByCodeAndPwd);
		
		if(user_code.equals(userByCodeAndPwd.getUser_code()) && user_password.equals(userByCodeAndPwd.getUser_password())) {
			ActionContext.getContext().getSession().put("user", userByCodeAndPwd);
			return "login";
		}else {
			return "wrong";
		}
		
		
		
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		return user;
	}
	
}
