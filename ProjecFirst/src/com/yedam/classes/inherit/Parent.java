package com.yedam.classes.inherit;

public class Parent {
	private String lastName;
	private String firstName;
	private String telNumber; //집 전화번호
	
	public Parent() {
		
	}

	public Parent(String lastName, String firstName, String telNumber) {
		super(); // Object 클래스 상속.
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "lastName=" + lastName + " firstName=" + firstName;
	}
	
}
