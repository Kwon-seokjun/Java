package org.comstudy21.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10Ex04 {

	public static int getInt() {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		while(true) {
			try {
				
				number = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println(">>> ���� �߻� : ������ �Է� �ϼ���");
				// ���ۿ� �����ִ� ���ڸ� �����Ѵ�.
				scan.next();
				continue;
			}
		}
		scan.close();
		return number;
	}
	public static void main(String[] args) {
		System.out.print("�����Է� : ");
		int num = getInt();
		System.out.println("num = " + num);
	}
}
