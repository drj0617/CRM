package com.crm.service.imp;

import java.util.List;

import com.crm.beans.BaseDict;
import com.crm.dao.BasedictDao;
import com.crm.service.BasedictService;

public class BasedictServiceImp implements BasedictService{

	private BasedictDao basedictDao;
	
	@Override
	public List<BaseDict> findDictTypeNameByCode(String dict_type_code) {

		List<BaseDict> list = basedictDao.findTypeNameByCode(dict_type_code);
		
		return list;
	}

	public BasedictDao getBasedictDao() {
		return basedictDao;
	}

	public void setBasedictDao(BasedictDao basedictDao) {
		this.basedictDao = basedictDao;
	}
	

}
