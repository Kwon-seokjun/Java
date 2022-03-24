package org.comstudy21.day04;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a, b;
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("철수 >> ");
		a = scan.next();
		System.out.print("영희 >> ");
		b = scan.next();
		
		if(a.equals("가위")) {
			if(b.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(b.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}else {
				System.out.println("철수가 이겼습니다.");
			}
		}else if(a.equals("바위")) {
			if(b.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(b.equals("바위")) {
				System.out.println("비겼습니다");
			}else {
				System.out.println("영희가 이겼습니다.");
			}
		}else if (a.equals("보")) {
			if(b.equals("가위")) {
				System.out.println("영희가 이겼습니다");
			}else if(b.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		scan.close();
	}
}
