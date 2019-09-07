package com.crm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;

import com.crm.beans.Customer;
import com.crm.beans.LinkMan;

public interface CustomerDao {

	void save(Customer customer);
	void deleteCustomer(Customer customer);
	void modify(Customer customer);

	Customer findCustomerById(Long id);

	List<Customer> getAllCustomer();
	List<Customer> getAllCustomer(DetachedCriteria dc);
	void removeCustomer(Long id);


}
