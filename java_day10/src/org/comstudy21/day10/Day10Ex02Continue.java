package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex02Continue {

	public Day10Ex02Continue() {
		// ���� 5���� �Է� �޴´�.
		// �Է� �� ���� �߿� ������� �����Ѵ�. (continue Ȱ��)
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int n = 0;
		
		System.out.println("���� 5�� �Է��ϼ���");
		for(int i=0; i<5; i++) {
			n = scan.nextInt();
			if(n < 0) {
				continue;
			} else {
				total += n;
			}
		}
		System.out.println("��� ����(total) = " + total);
	}
	
	public static void main(String[] args) {
		new Day10Ex02Continue();
	}

}
