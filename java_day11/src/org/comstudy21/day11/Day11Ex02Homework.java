package org.comstudy21.day11;

import java.util.Scanner;

public class Day11Ex02Homework {
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static final Scanner scan = new Scanner(System.in);
	int month, day, total, nextMonth, nextDay;
	// 실전에서는 Data클래스 or Calendar 클래스 사용하면 편리하다.
	
	public Day11Ex02Homework() {
		findDay();
	}
	
	public void findDay() {
		System.out.print("월 / 일 입력 : ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.println(month+"월 "+day+"일의 100일 후는?");
		
		total = 100 - (days[month-1]-day);
		int i = month % 12;
		while(total > days[i]) {
			total -= days[i];
			i++;
			i %= 12;
		}
		nextMonth = i+1;
		nextDay = total;
		System.out.println(nextMonth + "월 " + nextDay + "일입니다!");
	} 
	
	public static void main(String[] args) {
		new Day11Ex02Homework();
	}

}
