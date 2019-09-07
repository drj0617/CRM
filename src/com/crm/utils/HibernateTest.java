package com.crm.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.beans.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HibernateTest {

	@Autowired
	SessionFactory sessionFactory;
	@Test
	public void test01() {
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, 1l);
		
		System.out.println(customer);
		
		tx.commit();
		
		session.close();
		
	}
	
	@Test
	public void test02() {
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, 5l);
		
		System.out.println(customer);
		
		tx.commit();
		
		session.close();
		
	}
	
}
