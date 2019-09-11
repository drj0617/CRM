package com.crm.dao;

import java.util.List;

import com.crm.beans.BaseDict;

public interface BasedictDao extends BaseDao<BaseDict>{

	List<BaseDict> findTypeNameByCode(String dict_type_code);

}
