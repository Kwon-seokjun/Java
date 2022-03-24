package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Homework {

	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int month=0, day=0;
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		int num = month;
		
		// 월 계산
		int re=month+3;
		int monthnum=0;
		if(re>12) {
			re = re-12;
			month=0;
		}
		
		int sum = 0;
		for(int i=month; i<days.length; i++) {
			total += days[i];
			if(total<100) {
				sum = 100-total;
			}
			
		}
		System.out.printf("%d월 %d일의 100일 후는?  %d월 %d일입니다! \n", num, day, re, day+sum);
	}

}
