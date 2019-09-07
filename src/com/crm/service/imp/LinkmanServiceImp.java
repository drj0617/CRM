package com.crm.service.imp;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.LinkMan;
import com.crm.dao.LinkmanDao;
import com.crm.service.LinkmanService;

public class LinkmanServiceImp implements LinkmanService {

	private LinkmanDao linkmanDao;
	

	@Override
	public LinkMan findlikman(Long id) {

		LinkMan linkMan = linkmanDao.findLinkmanById(id);
		
		return linkMan;
	}

	@Override
	public List<LinkMan> findAllLinkMan() {

		
		return null;
	}

	@Override
	public List<LinkMan> findAllLinkMan(DetachedCriteria dc) {

		List<LinkMan> list = linkmanDao.findLinkMan(dc);
		
		return list;
	}

	@Override
	public void modifyLinkman(LinkMan linkman, Long old_lkm_id, Long cust_id) {
		linkmanDao.modify(linkman);
	}

	@Override
	public void deleteLinkmanById(Long id) {
		linkmanDao.deleteLinkman(id);
	}

	@Override
	public void add(Long cust_id, LinkMan linkman) {
		// TODO Auto-generated method stub
		
	}
	
	public LinkmanDao getLinkmanDao() {
		return linkmanDao;
	}

	public void setLinkmanDao(LinkmanDao linkmanDao) {
		this.linkmanDao = linkmanDao;
	}



}
