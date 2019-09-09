package com.crm.web.action;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.crm.beans.LinkMan;
import com.crm.service.LinkmanService;
import com.crm.service.imp.LinkmanServiceImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LinkmanAction extends ActionSupport implements ModelDriven<LinkMan>{

	private LinkmanService linkmanService;
	private LinkMan linkman = new LinkMan();
	
	private Long cust_id;
	private Long lkm_cust_id;
	


	public String add() {
		
		linkmanService.add(cust_id,linkman);
		
		return "toList";
		
	}
	
	public String list() {
		
		DetachedCriteria dc = DetachedCriteria.forClass(LinkMan.class);

		if(linkman.getLkm_name() != null) {
			dc.add(Restrictions.like("lkm_name","%"+linkman.getLkm_name()+"%"));
		}
		
		List<LinkMan> list = linkmanService.findAllLinkMan(dc);
		
		ActionContext.getContext().put("list", list);
		
		return "list";
	}
	
	public String delete() {
		
		linkmanService.deleteLinkmanById(linkman.getLkm_id());
		
		return "delete";
	}
	
	public String modify() {

		return "modify";
	}
	
	public String update() {
		
		linkmanService.modifyLinkman(linkman, linkman.getLkm_id(), cust_id);
		return "update";
	}
	
	
	
	public LinkmanService getLinkmanService() {
		return linkmanService;
	}

	public void setLinkmanService(LinkmanService linkmanService) {
		this.linkmanService = linkmanService;
	}

	public LinkMan getLinkman() {
		return linkman;
	}

	public void setLinkman(LinkMan linkman) {
		this.linkman = linkman;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	
	public Long getLkm_cust_id() {
		return lkm_cust_id;
	}
	
	public void setLkm_cust_id(Long lkm_cust_id) {
		this.lkm_cust_id = lkm_cust_id;
	}
	
	@Override
	public LinkMan getModel() {
		return linkman;
	}

}
