package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Homework {

	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int month=0, day=0;
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		int num = month;
		
		// �� ���
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
		System.out.printf("%d�� %d���� 100�� �Ĵ�?  %d�� %d���Դϴ�! \n", num, day, re, day+sum);
	}

}
