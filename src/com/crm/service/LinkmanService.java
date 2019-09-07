package com.crm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.LinkMan;

public interface LinkmanService {

	LinkMan findlikman(Long id);
	List<LinkMan> findAllLinkMan();
	List<LinkMan> findAllLinkMan(DetachedCriteria dc);
	void modifyLinkman(LinkMan linkman, Long old_lkm_id, Long cust_id);
	void deleteLinkmanById(Long id);
	void add(Long cust_id, LinkMan linkman);



}
