package com.crm.beans;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	
	private Long cust_id;
	private String cust_name;
	private String cust_phone;
	private String cust_mobile;
	
	private BaseDict cust_source;
	private BaseDict cust_level;
	private BaseDict cust_industry;
	private Set<LinkMan> linkmen = new HashSet<LinkMan>();
	
	public Customer() {
		super();
	}
	
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public BaseDict getCust_source() {
		return cust_source;
	}

	public void setCust_source(BaseDict cust_source) {
		this.cust_source = cust_source;
	}

	public BaseDict getCust_level() {
		return cust_level;
	}

	public void setCust_level(BaseDict cust_level) {
		this.cust_level = cust_level;
	}

	public BaseDict getCust_industry() {
		return cust_industry;
	}

	public void setCust_industry(BaseDict cust_industry) {
		this.cust_industry = cust_industry;
	}

	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public Set<LinkMan> getLinkmen() {
		return linkmen;
	}
	public void setLinkmen(Set<LinkMan> linkmen) {
		this.linkmen = linkmen;
	}

	
}
