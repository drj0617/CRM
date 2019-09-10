package com.crm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.Customer;
import com.crm.utils.PageBean;

public interface CustomerService {

	Customer findCustomer(Long id);
	void saveCustomer(Customer c);
	void modifyCustomer(Customer c);
	void removeCustomerById(Long id);
	PageBean<Customer> finAllCustomerByPageBean(DetachedCriteria dc, int pageSize, int currentPage);

}
