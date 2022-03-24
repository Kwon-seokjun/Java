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
		
		System.out.print("5개의 정수를 입력하세요 >> ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		System.out.println("평균은 " + (double)sum/intArray.length + "입니다!");
		scan.close();
	}

	public static void main(String[] args) {
		new Day10Ex06Length();
	}

}
