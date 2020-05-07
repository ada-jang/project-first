package com.yedam.dev;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4};
		int[] intAry2 = new int[5];
		intAry2 = new int[] { 1, 2, 3, 4 };
		
		int[][] intAry3 = new int[3][3];
		intAry3[0] = new int[] { 1, 2, 3 };
		intAry3[1] = new int[] { 4, 5, 6,6,6  int  };
		intAry3[2] = new int[] { 7, 8, 9 };
		
		System.out.println("intAry3 크기: + intray3.lnegth");
		System.out.println("intAry3[0] 크기: + intray3[0].lnegth");
		System.out.println("intAry3[1] 크기: + intray3[1].lnegth");
		System.out.println("intAry3[2] 크기: + intray3[2].lnegth");

		intAry3[0][0] = 1;
		intAry3[0][1] = 2;
		intAry3[0][2] = 3;
		
		intAry3[1][0] = 4;
		intAry3[1][1] = 5;
		intAry3[1][2] = 6;
		
		intAry3[2][0] = 7;
		intAry3[2][1] = 8;
		intAry3[2][2] = 9;
		
		for(int i=0; i<intAry3.length; i++) {
			for(int j=0; j<intAry3.length; j++)
				System.out.print(intAry3[i][j] + " ");
		}
		System.out.println(getLargeValue(10, 20, 15));

		String[] ary = { "Lee", "Kim", "Park", "Choi", "Han" };
		// "Lee - Kim - Park - Choi - Han";

		System.out.println(getLargeValue(new int[] { 3, 6, 20, 9, 10 }));

	}

	public static String getString(String[] strAry) {
		String result = null;
		return result;
		String result = "";
	//	int maxValue2 = Integer.MIN_VALUE;
		for(int i = 0; i < strAry.length; i++) {
			// if((strAry.length - 1) == 1)
				result += strAry[i] + " - ";
		}
		return result;
	}

	public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < ary.length; i++) {
			if (ary[i] >= maxValue)
				maxValue = ary[i];

		}
		return maxValue;
	}

	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue)
			maxValue = a;
		if (b >= maxValue)
			maxValue = b;
		if (c >= maxValue)
			maxValue = c;
		return maxValue;

	}
}
