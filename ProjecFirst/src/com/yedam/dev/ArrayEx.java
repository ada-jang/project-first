package com.yedam.dev;
// unfinished
public class ArrayEx {
	public static void main(String[] args) {
		String[] strAry = { "Hello", "World", "Nice", "10" };
		// " " 큰 따옴표 사이에 있을 경우 문자로 인식
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		// enhanced for
		for (String str : strAry) {
			System.out.println(str);
		}
		
	} // end of main()
	
	public static double avgAry(double[] ary) {
		double sum = 0, avg = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
	}
	
	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i]
		}
	}
} // end of class
