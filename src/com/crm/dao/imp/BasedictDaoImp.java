package com.crm.dao.imp;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.crm.beans.BaseDict;
import com.crm.dao.BasedictDao;

public class BasedictDaoImp extends BaseDaoImp<BaseDict> implements BasedictDao{

	@Override
	public List<BaseDict> findTypeNameByCode(String dict_type_code) {

		DetachedCriteria criteria = DetachedCriteria.forClass(BaseDict.class);
		
		criteria.add(Restrictions.eq("dict_type_code", dict_type_code));
		
		return (List<BaseDict>) getHibernateTemplate().findByCriteria(criteria);
		
	}

}
