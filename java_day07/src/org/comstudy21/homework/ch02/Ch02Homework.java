package org.comstudy21.homework.ch02;

import java.util.Scanner;

public class Ch02Homework {

	public static void main(String[] args) {
		// ����� ���̸� �Է� �޾Ƽ� ����ϴ� ���α׷�
		// �� ��Ʈ�� ������ �ٽ� �Ͻðڽ��ϱ�? y �Ǵ� n�� �Է� �ǵ��� �Ѵ�.
		Scanner scan = new Scanner(System.in);
		String name = null;
		int age = 0;
		
		System.out.print("������ �Է� �ϼ��� >> ");
		name = scan.next();
		System.out.print("���̸� �Է� �ϼ��� >> ");
		age = scan.nextInt();
		System.out.printf("%s���� %d���Դϴ�.\n", name, age);
		System.out.print("����Ͻðڽ��ϱ�? (y/n) >> ");
		char yn = scan.next().charAt(0);
		while(!(yn == 'n' || yn == 'y')) {
			System.out.println("y�Ǵ� n�� �Է� �ϼ���");
			System.out.print("����Ͻðڽ��ϱ�? (y/n) >> ");
			yn = scan.next().charAt(0);
		}
		if(yn == 'y') {
			main(null);  // ���ȣ��
			return;
		} 
		System.out.println("�����ϼ̽��ϴ�.");
		scan.close();
	}
}
