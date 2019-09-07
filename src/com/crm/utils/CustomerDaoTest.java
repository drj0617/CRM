package com.crm.utils;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.beans.Customer;
import com.crm.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerDaoTest {
	
	@Autowired
	CustomerService customerDao;
	
	@Test
	public void test01() {
		
		List<Customer> query = customerDao.getAllCustomer();
		System.out.println(query);
		
	}
	
	@Test
	public void test02() {
		
		Customer customer = customerDao.findCustomer(1l);
		System.out.println(customer);
		
	}
	
	@Test
	public void test03() {
		
		customerDao.removeCustomerById(4l);
		
	}
	

}
