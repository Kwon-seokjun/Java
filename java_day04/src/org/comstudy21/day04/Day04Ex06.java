package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = 31;
		int month = 0;
		
		System.out.printf("월을 입력하세요: ");
		month = scan.nextInt();
		while(month<1 || month>12) {
			System.out.print("잘못 입력 하였습니다.(1월 ~ 12월 사이 입력) : ");
			month = scan.nextInt();
		}	
		
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
		}
		System.out.println(month+"월은 "+day+"일까지 있습니다~!");
	}
}
