package com.crm.dao.imp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.crm.beans.Customer;
import com.crm.dao.CustomerDao;

public class CustomerDaoImp extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		
		getHibernateTemplate().save(customer);
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println(customer);
		getHibernateTemplate().delete(customer);
		
	}

	@Override
	public void modify(Customer customer) {
		
		getHibernateTemplate().update(customer);
		
	}

	@Override
	public Customer findCustomerById(Long id) {

		Customer customer = getHibernateTemplate().get(Customer.class, id);
		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {

		List<Customer> allCustomer = getHibernateTemplate().execute(new HibernateCallback<List<Customer>>() {

			@Override
			public List<Customer> doInHibernate(Session session) throws HibernateException {
				
				String hql = "from Customer";
				Query query = session.createQuery(hql);
				List<Customer> list = query.list();
				
				return list;
			}
		});
		
		return allCustomer;
		
	}

	@Override
	public List<Customer> getAllCustomer(DetachedCriteria dc) {
		
		List<Customer> findByCriteria = (List<Customer>) getHibernateTemplate().findByCriteria(dc);
		
		return findByCriteria;
		
	}

	@Override
	public void removeCustomer(Long id) {
		
		Customer customer = getHibernateTemplate().get(Customer.class, id);
		
//		System.out.println("dao:"+id);
//		
//		System.out.println("dao:"+customer);
		
		getHibernateTemplate().delete(customer);
		
	}

	



}
