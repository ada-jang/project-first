package com.yedam.dev;

public class ArrayExample {
	public static void main(String[] args) {
		
		int[] intAry = new int[5];
		int[] intAry2 = {1,2,3,4,5};
		intAry[0] = 10;
		intAry[1] = 15;
		intAry[2] = 20;
		intAry[3] = 25;
		intAry[4] = 30;
	 // intAry[5] = 30; 오류(X) 배열범위 초과.

		int[] intAry3 = new int[10];
		intAry3[0] = 5;
		intAry3[1] = 10;
		intAry3[2] = 15;
		intAry3[3] = 20;
		intAry3[4] = 25;
		intAry3[5] = 30;
		intAry3[6] = 35;
		intAry3[7] = 40;
		intAry3[8] = 45;
		intAry3[9] = 50; // 변수 선언 배열 선언
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		// sum 변수에 intAry에 들어있는 각각의 합,
		int sum = intAry[0] + intAry[1] + intAry[2]
				+ intAry[3] + intAry[4];
		sum = 0;
		for(int i=0; i < 5; i++) {
			System.out.println(intAry[i]);
			sum += intAry[i]; // sum 변수에 intAry에 들어있는 각각의 합,
		}
		
		for (int i = 0; i < 10; i++) {
			intAry3[i] = 6 * (i + 1); // 뒤에 나온 반복문에 의해 먼저 나온 intAry3[0]~[9]값(5*n)은 취소
		}
		// 출력.
		for (int i = 0; i < intAry3.length; i++) {
			System.out.println(intAry3[i]);
		}
		// 문제.
		// 5,10,15,20,25,...50
	}
}
