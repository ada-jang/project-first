package com.yedam.exceptions;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[3];

		for (int i = 0; i <= intAry.length; i++) {
			try {
				intAry[i] = i + 1;
				System.out.println(intAry[i]);
				int num1 = Integer.parseInt(args[0]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다, intAry[" + i + "]");
			} catch (NumberFormatException e1) {
				System.out.println("변환 불가");
			} catch (Exception e2) {
				System.out.println("알 수 없는 오류 발생.");
		}
		}
		System.out.println("end of prog.");
	}
}