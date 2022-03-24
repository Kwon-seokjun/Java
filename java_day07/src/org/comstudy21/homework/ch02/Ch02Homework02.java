package org.comstudy21.homework.ch02;

import java.util.Scanner;

public class Ch02Homework02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			printInfo(); // printInfo() �Լ� ȣ��
			char ch = getYN();
			if(ch == 'n') {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			}
		}
		scan.close();
	}

	private static char getYN() {
		System.out.print("����Ͻðڽ��ϱ�? (y/n) >> ");
		char ch = scan.next().charAt(0);
		while(!(ch == 'y' || ch == 'n')) {
			System.out.println("y�Ǵ� n�� �Է��ϼ���.");
			System.out.print("����Ͻðڽ��ϱ�? (y/n) >> ");
			ch = scan.next().charAt(0);
		}
		return ch;
	}

	public static void printInfo() {
		
		String name = null;
		int age = 0;
		
		System.out.print("���� �Է� >> ");
		name = scan.next();
		System.out.print("���� �Է� >> ");
		age = scan.nextInt();
		
		System.out.printf("%s���� %d���Դϴ�.\n",name, age);
	}

}
