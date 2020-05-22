package com.yedam.generic;

public class Box<D> {
	D object;
	
	void set(D object) {
		this.object = object;
	}
	
	D get() {
		return object;
	}
	
	// Object->T,D,Apple,Orange / type parameter

}
