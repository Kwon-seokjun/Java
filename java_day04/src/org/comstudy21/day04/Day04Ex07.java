package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name,a = "y";
		int age;
		
		while(a.equals("y")) {
		System.out.print("���� �Է� >> ");
		name = scan.next();
		System.out.print("���� �Է� >> ");
		age = scan.nextInt();
		
		System.out.println(name+"���� "+age+"�� �Դϴ�.");
		
		System.out.println("-------------------------");
		
		System.out.print("��� �Ͻðڽ��ϱ�? (y/n) >> ");
		a = scan.next();
		}
		
		if(a.equals("n")) {
			System.out.println("�����ϼ̽��ϴ�. ���� ��ȸ�� ...");
		}
		while(!a.equals("n")) {
			System.out.print("��� �Ͻðڽ��ϱ�(y/n) >> ");
			a = scan.next();
		}
	}
}