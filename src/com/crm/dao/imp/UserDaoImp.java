package com.crm.dao.imp;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.crm.beans.User;
import com.crm.dao.UserDao;

public class UserDaoImp extends HibernateDaoSupport implements UserDao{


	@Override
	public User getUserByCodeAndPwd(String code, String pwd) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("user_code",code));
		
		List<User> list = (List<User>) getHibernateTemplate().findByCriteria(criteria);
		
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	
	}

}
