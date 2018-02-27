package com.liyiandxuegang.methods;

import com.opensymphony.xwork2.ActionSupport;

public class GeneralFuncsAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String add(){
		System.out.println("add function");
		return NONE;
	}
	
	public String update() {
		System.out.println("update function");
		return NONE;
	}
}
