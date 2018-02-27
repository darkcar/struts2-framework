package com.liyiandxuegang.action2;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println("bookAction");
		return SUCCESS;
	}
	
}
