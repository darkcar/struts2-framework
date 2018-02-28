package com.liyiandxuegang.data;

import com.liyiandxuegang.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Data2Action extends ActionSupport implements ModelDriven<User>{

	private static final long serialVersionUID = 1L;

	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}
}
