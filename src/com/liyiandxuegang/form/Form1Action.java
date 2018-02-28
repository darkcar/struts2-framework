package com.liyiandxuegang.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		// Use method 1, ActionContext
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> map = actionContext.getParameters();
		// loop map
		Set<String> keysSet = map.keySet();
		for(String key : keysSet) {
			// Value is in array format. 
			Object[] obj = (Object[]) map.get(key);
			System.out.println(Arrays.toString(obj));
		}
		return NONE;
	}
	
	public String testServletActionContext() {
		HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
		String username= httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("pwd");
		String address = httpServletRequest.getParameter("address");
		System.out.println(username + ", " + password + ", " + address);
		httpServletRequest.setAttribute("username", username);
		
		// get session , login and shopping cart. 
		HttpSession session = httpServletRequest.getSession();
		session.setAttribute("sess", "sessVal");
		
		// get servletContext domain
		ServletContext servletContext = ServletActionContext.getServletContext();
		servletContext.setAttribute("contextName", "contextval");
		
		
		return NONE;
	}
}
