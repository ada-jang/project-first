package com.yedam.morning;

public class Code20200518 {

	public static void main(String[] args) {
		int[] intAry = { 10, 8, 5, 3, 7, 1 };

		int tmep = 0;
		for (int j = 0; j < intAry.length-1; j++) {
			for (int i = 0; i < intAry.length-1; i++) {

				if (intAry[i] > intAry[i + 1]) {
					tmep = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = tmep;

				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

	}
}
