package com.yedam.nestedInterFaces;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener() {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
