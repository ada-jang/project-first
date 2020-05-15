package com.yedam.morning;

public class Code20200515P {
	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(cnt + "\t");
				cnt++;
			}

			System.out.println();
		} // 1
		System.out.println("==========================================");
		for (int a = 1; a <= 5; a++) {

			for (int b = 0; b < 5; b++) {

				System.out.print(a + b * 5 + "\t");
			}

			System.out.println();
		} // 2
	}

}
