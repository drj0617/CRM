package com.crm.utils;

import java.util.List;

public class PageBean<T> {
	
	private int currentPage;
	private int pageSize;
	private int totalCount;
	private int totalPage;
	private List<T> list;
	
	
	public PageBean(int currentPage, int pageSize, int totalCount) {
		super();
		this.currentPage = currentPage;
		if(this.currentPage == 0) {
			this.currentPage = 1;
		}
		this.pageSize = pageSize;
		if(this.pageSize ==0) {
			this.pageSize = 5;
		}
		this.totalCount = totalCount;
		
		this.totalPage = (this.totalCount + this.pageSize - 1) / this.pageSize;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
	

}
