package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = 31;
		int month = 0;
		
		System.out.printf("���� �Է��ϼ���: ");
		month = scan.nextInt();
		while(month<1 || month>12) {
			System.out.print("�߸� �Է� �Ͽ����ϴ�.(1�� ~ 12�� ���� �Է�) : ");
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
		System.out.println(month+"���� "+day+"�ϱ��� �ֽ��ϴ�~!");
	}
}
