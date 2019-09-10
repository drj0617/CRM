package com.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.LinkMan;

public interface LinkmanDao {

	void add(LinkMan linkman);
	void deleteLinkman(Long id);
	void modify(LinkMan linkman);

	LinkMan findLinkmanById(Long id);

	List<LinkMan> findLinkMan(DetachedCriteria dc);
	int findTotalCount(DetachedCriteria dc);
	List<LinkMan> findAllLinkmanByPageBean(DetachedCriteria dc, int currentPage, int pageSize);


}
