package com.liyiandxuegang.data;

import com.liyiandxuegang.entity.Book;
import com.liyiandxuegang.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class Data3Action extends ActionSupport{
	private User user;
	private Book book;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		System.out.println(book);
		return NONE;
	}
}
