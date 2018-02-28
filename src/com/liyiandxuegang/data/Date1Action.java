package com.liyiandxuegang.data;

import com.opensymphony.xwork2.ActionSupport;

public class Date1Action extends ActionSupport{
	private String username;
	private String pwd;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String execute() throws Exception {
		 System.out.println(username + ", " + pwd + ", " + address);
		return NONE;
	}
}
