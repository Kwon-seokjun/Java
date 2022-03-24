package org.comstudy21;

import java.util.Scanner;

public class CircleArea {
	
	// main �ۿ��� ������ ���� static �ٿ��� ����
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// ���� �Է¹޾Ƽ� �������͸� ����ϴ� ���α׷�
		// 1���� �� 3.30579�����̴�.
		// �������͸� �Է¹޾Ƽ� ���� ����ϴ� ���α׷� ����.
		final double �� = 3.30579;
		double r = 0;
		double result = 0;
		
		System.out.println("---��� ����---\n");
		
		System.out.printf("��� �Է�: ");
		r = scan.nextDouble();
		
		result = r * ��;
		
		// System.out.println(r+"���� �������ʹ� " + result+"�Դϴ�.");
		
		System.out.printf("%.0f���� �������ʹ� %f�Դϴ�.\n\n", r, result);
		// -----------------------------------
		
		System.out.printf("�������� �Է�: ");
		r = scan.nextDouble();
		
		result = r / ��;
		
		// System.out.println(r+"���������� ����� " + result+"�Դϴ�.");
		
		System.out.printf("%f���������� ����� %.0f�Դϴ�.", r, result);
	}

	public static void ex01(String[] args) {
		// ��� PI ���� - Math.PI�ε� ����
		final double PI = 3.141592;
		double r = 10;
		double circleArea = 0;
		
		// Ű����� �������� �Է¹޾Ƽ� ��� �ϱ�
		System.out.print("������ �Է�: ");
		r = scan.nextDouble();
		
		// �����ϱ� - �������� �̿��ؼ� ������ ���Ѵ�.
		// �װ� ������ ���̿��� ���� ��� �ȴ�.
		// �������� ���� ����
		circleArea = r * r * PI;
		
		// ��� ���
		// System.out.println("�������� "+r+"�� ���� ������ ");
		// System.out.println(circleArea+"�Դϴ�.");
		// println() ��� printf()�� ���(print format ���)
		
		// System.out.printf("�������� %.1f�� ���� ���̴� %.4f�Դϴ�.\n", r, circleArea);
		
		String msg = String.format("�������� %.1f�� ���� ���̴� %.4f�Դϴ�.\n", r, circleArea);
		
		System.out.println(msg);

	}

}
