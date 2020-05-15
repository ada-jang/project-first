package com.yedam.classes.inherit;

import java.util.Scanner;

public class AdressBook {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		Friend[] adresses = new Friend[10];
		
		while(true) {
			System.out.println("주소록에 입력하려는 친구 유형 선택");
			System.out.println("");
			System.out.println("====================");
			System.out.println("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			if(menu==1) {
				System.out.println("친구 이름을 입력하세요");
				String name = scn.nextLine();
				System.out.println("번호를 입력하세요.");
				String phoneNumber = scn.nextLine();
			/*	System.out.println("주소를 입력하세요."); */
				
				Friend friend = new Freind(name, phoneNumber);
				
				for (int i=0; i < adresses.length; i++) {
					if(adresses[i]==null) {
						adresses[i] = friend;
						System.out.println(adresses[0]);
						break;
					}
				}
			} else if (menu==2) {
				System.out.println("대학 친구 이름을 입력하세요");
				String name = scn.nextLine();
				System.out.println("대학 친구 전화번호를 입력하세요");
				String phoneNumber = scn.LextLine();
			} else if (menu==3) {
				System.out.println("이름 조회 선택");
			
			} else if (menu==4) {
				System.out.println("종료 선택");
				break;
			}
		}
	}
		System.out.println("프로그램 종료.");
//		private void addAdress() {
//			System.out.println("");
//			String 
//		}
//		
//		private void fullList() {
//			System.out.println("");
//		}
//		
//		private void nameLookup() {
//			System.out.println("");
//		}
}
