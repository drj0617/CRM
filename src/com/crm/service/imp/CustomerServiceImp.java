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

public class CustomerServiceImp implements CustomerService {

	private CustomerDao customerDao;
	
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> list = customerDao.getAllCustomer();
		return list;
	}

	@Override
	public List<Customer> getAllCustomer(DetachedCriteria dc) {
		
		List<Customer> list = customerDao.getAllCustomer(dc);
		
		return list;
	}

	@Override
	public Customer findCustomer(Long id) {
		
		Customer customer = customerDao.findCustomerById(id);
		
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
		customerDao.removeCustomer(id);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);
	}

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	
	


}
