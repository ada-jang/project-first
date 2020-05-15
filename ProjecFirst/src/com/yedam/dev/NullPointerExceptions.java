package com.yedam.dev;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "Hello";

	try { 
		System.out.println(str.toString());
		Class.forName("java.lang.String");
	} catch (Exception e) {
		System.out.println("알 수 없는 예외 발생.");
//		e.printStackTrace();
}
		
		System.out.println("프로그램 종료.");
	
}
