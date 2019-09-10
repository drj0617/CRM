package com.crm.dao.imp;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.crm.beans.Customer;
import com.crm.dao.BaseDao;

public class BaseDaoImp<T> extends HibernateDaoSupport implements BaseDao<T>{

	private Class clazz;
	
	public BaseDaoImp() {
		// this指当前对象，而在实际调用中，this可以表示xxDaoImpl
		// 获得父类型中泛型参数类型
		ParameterizedType types = (ParameterizedType) this.getClass().getGenericSuperclass();
		// 获得实际调用中真正的泛型对应的类型
		Type[] ts = types.getActualTypeArguments();
		
		clazz = ts[0].getClass();
		
	}

	@Override
	public void save(T t) {
		
		getHibernateTemplate().save(t);
		
	}

	@Override
	public void remove(Serializable id) {
	
		T t = findById(id);
		getHibernateTemplate().delete(t);
		
	}

	@Override
	public void modify(T t) {
		
		getHibernateTemplate().update(t);
		
	}

	@Override
	public T findById(Serializable id) {
		
		return (T) getHibernateTemplate().get(clazz, id);
		
	}

	@Override
	public int findTatalCount(DetachedCriteria dc) {
		
		dc.setProjection(Projections.rowCount());
		
		List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(dc);
		
		dc.setProjection(null);
		
		return (int)(long)list.get(0);
		
	}

	@Override
	public List<T> finAllByPageBean(DetachedCriteria dc, int pageSize, int currentPage) {
		
		int firstResult = (currentPage -1) * pageSize;
		
		List<T> list = (List<T>) getHibernateTemplate().findByCriteria(dc,  firstResult , pageSize);
		
		return list;
	}
	
}
