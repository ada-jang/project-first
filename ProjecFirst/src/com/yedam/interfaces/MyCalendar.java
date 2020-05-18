package com.yedam.interfaces;

import java.util.Calendar;
// github
public class MyCalendar {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); // 오늘 날짜 현재 시간 기준
//		System.out.println(cal);
//		cal.set(2020, 3, 1);
//		System.out.println("년도 : " + cal.get(Calendar.YEAR));
//		System.out.println("월 : " + cal.get(Calendar.MONTH));
//		System.out.println("월 : " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("월 : " + cal.get(Calendar.DAY_OF_WEEK));
		showCal(2020, 6);
	}

	public static void showCal(int year, int month) {
		// year, month 달력 출력.
		int today = 1;
		int lastDay = getLastDay(2020, 6);
		int dayOfWeek = getDayOfWeek(2020, 6);
		System.out.println(" [" + 2020 + "년" + 6 + "월]");
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < week.length; i++) {
			System.out.printf(week[i]);
		}
		System.out.println();
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.printf("%3s", "");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("%3d", today); // -10
			if ((today + dayOfWeek - 1) % 7 == 0)
				System.out.println();
			today++;
		}

	}

	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		// 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
		if (month == 5) {
			dayOfWeek = 6; // 금
		} else if (month == 6) {
			dayOfWeek = 2; // 월
		} else if (month == 7) {
			dayOfWeek = 4; // 수
		} else if (month == 8) {
			dayOfWeek = 1; // 일
		}
		return dayOfWeek;
	}

	public static int getLastDay(int year, int month) {

		// 윤년 규칙 : 년도가 4로 나누어지면서 100으로는 안 나누어지는 해, 400 으로 나누어지는 해.
		int lastDay = 0;

		if ((month <= 7 && month % 2 == 1 || month >= 8 && month % 2 == 0)) {
			lastDay = 31;

		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				lastDay = 29;
			else
				lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}

	// if ((month<=7 && month % 2 == 1 || month<=8 && month % 2 == 0)) {
	// lastDay = 31;}
}
