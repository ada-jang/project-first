package com.yedam.interfaces;

public interface RemoteControl {
	// 상수 final static(포함)
	public int MAX_VOLUME = 0;
	public int MIN_VLOUME = 10;
	
	// 추상 메소드.
	public void turnOn();
	public void turnOff();
	
}
