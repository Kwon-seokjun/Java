package org.comstudy21.day11;

import java.util.Scanner;

public class Day11Ex02Homework {
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static final Scanner scan = new Scanner(System.in);
	int month, day, total, nextMonth, nextDay;
	// ���������� DataŬ���� or Calendar Ŭ���� ����ϸ� ���ϴ�.
	
	public Day11Ex02Homework() {
		findDay();
	}
	
	public void findDay() {
		System.out.print("�� / �� �Է� : ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.println(month+"�� "+day+"���� 100�� �Ĵ�?");
		
		total = 100 - (days[month-1]-day);
		int i = month % 12;
		while(total > days[i]) {
			total -= days[i];
			i++;
			i %= 12;
		}
		nextMonth = i+1;
		nextDay = total;
		System.out.println(nextMonth + "�� " + nextDay + "���Դϴ�!");
	} 
	
	public static void main(String[] args) {
		new Day11Ex02Homework();
	}

}
