package com.crm.web.action;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.crm.beans.Customer;
import com.crm.service.CustomerService;
import com.crm.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	private CustomerService customerService ;
	
	private Customer customer = new Customer();
	
	private int pageSize;
	private int currentPage;


	public String add() {
		
		customerService.saveCustomer(customer);
		
		return "toList";
		
	}
	
	public String list() {
		
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		
		if(customer.getCust_name() != null) {
			dc.add(Restrictions.like("cust_name", "%"+customer.getCust_name()+"%"));
		}
//		List<Customer> list = customerService.getAllCustomer(dc);
		
		PageBean<Customer> pageBean = customerService.finAllCustomerByPageBean(dc,pageSize,currentPage);
		
		ActionContext.getContext().put("pageBean", pageBean);
		
		return "list";
	}
	
	public String delete() {
		
		// customer.hbm.xml中级联关系cascade改为delete
//		System.out.println("ac:"+customer.getCust_id());
		customerService.removeCustomerById(customer.getCust_id());
		
		return "delete";
	}
	
	public String modify() {
		
		return "modify";
				
	}
	
	public String update() {
		
		customerService.modifyCustomer(customer);
		
		return "update";
	}
	
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public Customer getModel() {
		return customer;
	}

}
