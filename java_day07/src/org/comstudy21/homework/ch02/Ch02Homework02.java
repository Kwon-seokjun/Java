package org.comstudy21.homework.ch02;

import java.util.Scanner;

public class Ch02Homework02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			printInfo(); // printInfo() 함수 호출
			char ch = getYN();
			if(ch == 'n') {
				System.out.println("수고하셨습니다.");
				break;
			}
		}
		scan.close();
	}

	private static char getYN() {
		System.out.print("계속하시겠습니까? (y/n) >> ");
		char ch = scan.next().charAt(0);
		while(!(ch == 'y' || ch == 'n')) {
			System.out.println("y또는 n만 입력하세요.");
			System.out.print("계속하시겠습니까? (y/n) >> ");
			ch = scan.next().charAt(0);
		}
		return ch;
	}

	public static void printInfo() {
		
		String name = null;
		int age = 0;
		
		System.out.print("성명 입력 >> ");
		name = scan.next();
		System.out.print("나이 입력 >> ");
		age = scan.nextInt();
		
		System.out.printf("%s님은 %d세입니다.\n",name, age);
	}

}
