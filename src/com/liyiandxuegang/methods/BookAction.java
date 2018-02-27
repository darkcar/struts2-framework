package com.liyiandxuegang.methods;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	// Add method
	public String addBook() {
		System.out.println("Add book");
		return NONE;
	}
	
	// Update book
	public String updateBook(){
		System.out.println("Update Book");
		return NONE;
	}
}
