package org.comstudy21.homework;

import java.util.Scanner;

public class CH02Ex05 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// ���� 3���Է� -> �ﰢ���� �Ǵ��� �Ǻ��Ѵ�.
		int a = 0, b = 0, c = 0;
		
		System.out.println("���� 3���� �Է��Ͻÿ� >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		} else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		}
	}
}
