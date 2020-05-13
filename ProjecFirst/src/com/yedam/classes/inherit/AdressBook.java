package com.yedam.classes.inherit;

import java.util.Scanner;

public class AdressBook {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		Friend[] adresses = new Friend[10];
		
		while(true) {
			System.out.println("====================");
			System.out.println("1.주소 추가 2.전체 목록 3. 이름 조회 4. 종료");
			System.out.println("====================");
			System.out.println("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			if(menu==1) {
				System.out.println("주소 추가 선택.");
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
				System.out.println("번호를 입력하세요.");
				String phoneNumber = scn.nextLine();
				System.out.println("주소를 입력하세요.");
				int adress = scn.next/**/();
				/**/ Friend adresses = new Freind(name, phoneNumber, adress);
				for (int i=0; i<adresses.length; i++) {
					if(adresses[i]==null) {
						adresses[i] = 
						break;
					}
					}
				}
			else if (menu==2) {
				System.out.println("전체 목록 선택");
			}
			else if (menu==3) {
				System.out.println("이름 조회 선택");
			}
			else if (menu==4) {
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
