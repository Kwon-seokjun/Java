package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex05Array {
	
	public Day10Ex05Array() {
		ex05();
	}
	
	public void ex05() {
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];
		int max = 0;
		
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i]>max) {
				max = intArray[i];
			}
		}
		System.out.println("��� 5���� �ִ��� " + max + "�Դϴ�!");
	}

	public static void main(String[] args) {
		new Day10Ex05Array();
	}

}
