package org.comstudy21.day04;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a, b;
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		System.out.print("ö�� >> ");
		a = scan.next();
		System.out.print("���� >> ");
		b = scan.next();
		
		if(a.equals("����")) {
			if(b.equals("����")) {
				System.out.println("�����ϴ�.");
			}else if(b.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}else {
				System.out.println("ö���� �̰���ϴ�.");
			}
		}else if(a.equals("����")) {
			if(b.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else if(b.equals("����")) {
				System.out.println("�����ϴ�");
			}else {
				System.out.println("���� �̰���ϴ�.");
			}
		}else if (a.equals("��")) {
			if(b.equals("����")) {
				System.out.println("���� �̰���ϴ�");
			}else if(b.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else {
				System.out.println("�����ϴ�.");
			}
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		scan.close();
	}
}
