package org.comstudy21;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// ���ɳ� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("���� �Է�: ");
		String city = scan.next();
		System.out.println("��°��� "+ city + "�Դϴ�.\n");
		
		System.out.printf("���� �Է�: ");
		String age = scan.next();
		System.out.println("���̴� "+ age + "�� �Դϴ�.\n");
		
		System.out.printf("��ǥ �Է�: ");
		String as = scan.next();
		System.out.println("��ǥ�� "+ as + "�Դϴ�.\n");
		
		// scan�� �ݾ� �ش�.
		scan.close();
	}
}
