package com.crm.service.imp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.Customer;
import com.crm.dao.CustomerDao;
import com.crm.dao.imp.CustomerDaoImp;
import com.crm.service.CustomerService;
import com.crm.utils.PageBean;

public class CustomerServiceImp implements CustomerService {

	private CustomerDao customerDao;

	@Override
	public Customer findCustomer(Long id) {
		
		Customer customer = customerDao.findById(id);
		
		return customer;
	}

	@Override
	public void saveCustomer(Customer c) {
		customerDao.save(c);
	}

	@Override
	public void modifyCustomer(Customer c) {
		customerDao.modify(c);
	}
	
	@Override
	public void removeCustomerById(Long id) {
		customerDao.remove(id);
	}

	@Override
	public PageBean<Customer> finAllCustomerByPageBean(DetachedCriteria dc, int pageSize, int currentPage) {
		// 1.查询页数
		int totalCount = customerDao.findTatalCount(dc);
		// 2.查询全部
		PageBean<Customer> pageBean = new PageBean<Customer>(currentPage, pageSize,totalCount);
		List<Customer> list = customerDao.finAllByPageBean(dc,pageBean.getPageSize(),pageBean.getCurrentPage());
		
		pageBean.setList(list);
		
		return pageBean;
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	
	


}
