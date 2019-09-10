package com.crm.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {

	void save(T t);
	void remove(Serializable id);
	void modify(T t);

	T findById(Serializable id);
	int findTatalCount(DetachedCriteria dc);
	List<T> finAllByPageBean(DetachedCriteria dc, int pageSize, int currentPage);

}
