package com.crm.dao;

import com.crm.beans.User;

public interface UserDao {
	User getUserByCodeAndPwd(String code,String pwd);
}
