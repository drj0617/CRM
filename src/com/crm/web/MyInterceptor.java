package com.crm.web;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object object = session.get("user");
//		System.out.println(session.get("user"));
		if(object == null) {
			return "toLogin";
		}else {
			invocation.invoke();
		}
		return null;
	}

}
