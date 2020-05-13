package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent{
	Child() {
		super(); // Parent() : protected // 패키지가 다르더라도 접근 가능
	}
	Child(String lastName, String firstName, String telNumber) {
		super(lastName, firstName, telNumber);
	}
	// protected 구분.
	void showInfo() {
		Child child = new Child();
		child.getLastName(); // default X
		child.getFirstName(); // protected
		child.getTelNumber(); // public
	}
}
