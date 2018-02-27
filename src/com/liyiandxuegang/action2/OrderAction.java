package com.liyiandxuegang.action2;

import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("Goes to order action.");
		return SUCCESS;
	}
}
