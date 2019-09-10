package com.crm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.LinkMan;
import com.crm.utils.PageBean;

public interface LinkmanService {

	LinkMan findlikman(Long id);
	void modifyLinkman(LinkMan linkman, Long old_lkm_id, Long cust_id);
	void deleteLinkmanById(Long id);
	void add(Long cust_id, LinkMan linkman);
	PageBean<LinkMan> findAllLinkManByPageBean(DetachedCriteria dc, int currentPage, int pageSize);

}
