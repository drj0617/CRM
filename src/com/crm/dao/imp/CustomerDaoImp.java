package com.crm.dao.imp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.crm.beans.Customer;
import com.crm.dao.CustomerDao;

@SuppressWarnings("all")
public class CustomerDaoImp extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		
		getHibernateTemplate().save(customer);
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
//		System.out.println(customer);
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

	@Override
	public int findTatalCount(DetachedCriteria dc) {

		dc.setProjection(Projections.count("cust_id"));
		
		List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(dc);
		
		dc.setProjection(null);
		
		return (int)(long)list.get(0);
	}

	@Override
	public List<Customer> finAllCustomerByPageBean(DetachedCriteria dc, int pageSize, int currentPage) {

		int firstResult = (currentPage -1) * pageSize;
		List<Customer> list = (List<Customer>) getHibernateTemplate().findByCriteria(dc,  firstResult , pageSize);
		
		return list;
	}

	



}
