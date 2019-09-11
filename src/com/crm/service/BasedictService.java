package com.crm.service;

import java.util.List;

import com.crm.beans.BaseDict;

public interface BasedictService {

	List<BaseDict> findDictTypeNameByCode(String dict_type_code);

}
