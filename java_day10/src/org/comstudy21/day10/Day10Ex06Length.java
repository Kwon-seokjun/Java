package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex06Length {
	
	public Day10Ex06Length() {
		ex06();
	}
	
	public void ex06() {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		
		System.out.print("5���� ������ �Է��ϼ��� >> ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		System.out.println("����� " + (double)sum/intArray.length + "�Դϴ�!");
		scan.close();
	}

	public static void main(String[] args) {
		new Day10Ex06Length();
	}

}
