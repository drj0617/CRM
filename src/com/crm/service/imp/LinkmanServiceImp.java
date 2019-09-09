package com.crm.service.imp;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.Customer;
import com.crm.beans.LinkMan;
import com.crm.dao.CustomerDao;
import com.crm.dao.LinkmanDao;
import com.crm.service.LinkmanService;

public class LinkmanServiceImp implements LinkmanService {

	private LinkmanDao linkmanDao;
	private CustomerDao customerDao;

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
		
		Customer customer = customerDao.findCustomerById(cust_id);
		
		LinkMan old_linkman = linkmanDao.findLinkmanById(old_lkm_id);
		
		customer.getLinkmen().add(old_linkman);
		
		old_linkman.setCustomer(customer);
		
		old_linkman.setLkm_email(linkman.getLkm_email());
		old_linkman.setLkm_gender(linkman.getLkm_gender());
		old_linkman.setLkm_memo(linkman.getLkm_email());
		old_linkman.setLkm_mobile(linkman.getLkm_mobile());
		old_linkman.setLkm_name(linkman.getLkm_name());
		old_linkman.setLkm_phone(linkman.getLkm_phone());
		old_linkman.setLkm_position(linkman.getLkm_position());
		old_linkman.setLkm_qq(linkman.getLkm_qq());
		
	}

	@Override
	public void deleteLinkmanById(Long id) {
		linkmanDao.deleteLinkman(id);
	}

	@Override
	public void add(Long cust_id, LinkMan linkman) {
		
		Customer customer = customerDao.findCustomerById(cust_id);
		
		customer.getLinkmen().add(linkman);
		linkman.setCustomer(customer);
		
		linkmanDao.add(linkman);
		
		
	}
	
	public LinkmanDao getLinkmanDao() {
		return linkmanDao;
	}

	public void setLinkmanDao(LinkmanDao linkmanDao) {
		this.linkmanDao = linkmanDao;
	}



}
