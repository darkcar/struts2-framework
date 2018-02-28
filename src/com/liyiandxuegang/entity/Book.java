package com.liyiandxuegang.entity;

public class Book {
	private String bookName;
	private double bookPrice;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return this.bookName + ", " + this.bookPrice;
	}
	
}
