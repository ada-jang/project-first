package com.yedam.morning;

public class Code20200526 {
	public static void main(String[] args) {
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 != 0) {
				sum2 += i;
			}
			if (i % 3 == 0 && i % 2 != 0) {
				sum3 += i;
			}
		}
		System.out.println("2의 배수합: " + sum2);
		System.out.println("3의 배수합: " + sum3);
	}
}