package com.crm.service;

import com.crm.beans.User;
import com.crm.utils.LoginException;

public interface UserService {
	User getUserByCodeAndPwd(String code, String pwd) throws LoginException;
}
