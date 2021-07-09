package com.springbootstarter.userDTO;

public class userDTO {
	private int ID;
	private String name;
	private long contactNo;
	
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
	@Override
	public String toString() {
		return "userDTO [ID=" + ID + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	
	
}
