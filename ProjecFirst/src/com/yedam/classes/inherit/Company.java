package com.yedam.classes.inherit;

public class Company extends Friend {

	public String department;
	
	public Company(String name, String phoneNumber, String department) {
		super(name, phoneNumber);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void showInfo() {
		System.out.println("이름" + name + "전화번호" + phoneNumber +
				"부서" + department);
	}
	
	
	
}
