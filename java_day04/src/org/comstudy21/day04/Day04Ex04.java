package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex04 {

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� \"Java�� " + 100 + "%\"" + "�����");
		
		System.out.printf("���� ������ �Է� : ");
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("�հ��Դϴ�~!");
		} else if(score < 80) {
			System.out.println("���հ��Դϴ�!");
		} else {
			System.out.println("�߸��� �Է��Դϴ�");
		}
		
		scanner.close();
	}
}
