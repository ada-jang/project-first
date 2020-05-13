package com.yedam.classes.inherit;

public class Friend {
	public String name;
	public String phoneNumber;

	public Friend(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("이름" + name + "전화번호" + phoneNumber);
	}

}
