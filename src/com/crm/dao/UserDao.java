package com.crm.dao;

import com.crm.beans.User;

public interface UserDao extends BaseDao<User>{
	User getUserByCodeAndPwd(String code,String pwd);
}
