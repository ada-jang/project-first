package com.yedam.classes;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Account[] accounts = new Account[100];
		while(true) {
			System.out.println("--------------------");
			System.out.println("1.계좌 생성 2.계좌 목록 3.예금 4.출금 5.종료");
			System.out.println("--------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			if(menu==1) {
				System.out.println("계좌 생성 선택.");
				System.out.println("계좌 번호를 입력하세요.");
				String ano = scn.nextLine(); // 변수 ano
				System.out.println("예금주 입력하세요.");
				String owner = scn.nextLine();
				System.out.println("금액을 입력하세요.");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for(int i=0; i<accounts.length; i++) {
					if(accounts[i]==null) {
						accounts[i] = acnt;
						break;
					}
				}
				System.out.println("계좌 생성 되었습니다.");
			} else if (menu==2) {
				System.out.println("계좌 목록 선택");
				// 전체 배열 중에 값이 있는 경우에만 출력 (null 제외)
				for(Account acc : accounts) {
					if(acc != null) {
					System.out.println("계좌 번호: " + acc.getAno()
										+ ", 예금주: " + acc.getOwner() 
										+ ", 잔액: " + acc.getBalance());
					}
				}
			} else if (menu==3) {
				System.out.println("예금 선택");
				System.out.println("계좌 번호 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("예금액 입력하세요.");
				int balance = scn.nextInt();
				// 전체 배열 중에 값이 있는 경우 && 입력 계좌 번호와 동일한 건에 처리.
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(ano)) {
						int result = acc.getBalance();
						acc.setBalance(result + balance);
					}
				}
				System.out.println("예금 처리가 되었습니다.");
			} else if (menu==4) {
				System.out.println("출금 선택");
				System.out.println("계좌 번호 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("출금액 입력하세요.");
				int balance = scn.nextInt();
				// 전체 배열 중에 값이 있는 경우 && 입력 계좌 번호와 동일한 건에 처리.
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(ano)) {
						int result = acc.getBalance();
						acc.setBalance(result - balance);
					}
				}
				System.out.println("출금 처리가 되었습니다.");
			} else if (menu==5) {
				System.out.println("종료 선택");
				break;
			}
		} // end of while()
		System.out.println("프로그램 종료.");
	} // end of main()
} // end of class
