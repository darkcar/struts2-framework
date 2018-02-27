package com.liyiandxuegang.action;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		// return ActionSupport.SUCCESS;
		System.out.println(ActionSupport.NONE);
		return ActionSupport.NONE;
	}
	
	// Create my own method
	
}
