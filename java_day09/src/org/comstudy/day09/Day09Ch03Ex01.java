package org.comstudy.day09;

import java.util.Scanner;

public class Day09Ch03Ex01 {

	public Day09Ch03Ex01() {
		// ����Ʈ ������
		ex01();
	}
	private void ex01() {
		int count=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���!");
		int n = scan.nextInt();
		
		while(n != -1) {
			sum += n;
			count++;
			n = scan.nextInt();
		}
		if(count == 0) {
			System.out.println("������ �Է��ϼ���!");
			main(null);
		}else {
			double avg = sum/(double)count;
		System.out.println("������ ������ "+count+"���̸� ����� "+avg+"�Դϴ�.");
		}
	}
	public static void main(String[] args) {
		new Day09Ch03Ex01();
	}

}
