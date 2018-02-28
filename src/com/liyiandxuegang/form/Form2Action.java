package com.liyiandxuegang.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.liyiandxuegang.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class Form2Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
		String username = httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("pwd");
		String address = httpServletRequest.getParameter("address");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		System.out.println(user);
		return NONE;
	}
}
