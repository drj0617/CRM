package com.crm.web.action;

import java.util.List;

import com.crm.beans.BaseDict;
import com.crm.service.BasedictService;
import com.opensymphony.xwork2.ActionSupport;

public class BasedictAction extends ActionSupport {

	private BasedictService basedictService;
	private String dict_type_code;
	private List<BaseDict> list ;

	public String list() {
		
		list = basedictService.findDictTypeNameByCode(dict_type_code);
		
		return "success";
	}

	public BasedictService getBasedictService() {
		return basedictService;
	}

	public void setBasedictService(BasedictService basedictService) {
		this.basedictService = basedictService;
	}

	public String getDict_type_code() {
		return dict_type_code;
	}

	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}

	public List<BaseDict> getList() {
		return list;
	}

	public void setList(List<BaseDict> list) {
		this.list = list;
	}
	

}
