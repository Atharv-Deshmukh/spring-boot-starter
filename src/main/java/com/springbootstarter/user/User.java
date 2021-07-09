package com.springbootstarter.user;

public class User {

	private int ID;
	private String name;
	private long contactNo;
	
	public User() {
		
	}
	
	public User(int iD, String name, long contactNo) {
		super();
		ID = iD;
		this.name = name;
		this.contactNo = contactNo;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
