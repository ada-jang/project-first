package com.yedam.classes.inherit;

public class University extends Friend {
	
	public String major;
	
	public University(String name, String phoneNumber, String major) {
		super(name, phoneNumber); 
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void showInfo() {
		System.out.println("이름" + name + "전화번호" + phoneNumber +
				"전공" + major);
	}
	
	
}
