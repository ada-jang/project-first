package com.yedam.morning;

public class Code20200515P2 {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = cnt++;
			}
		}

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("=================");
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3d", ary[j][i]);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", (i + j * 5));
			}
			System.out.println();
		}
	}
}