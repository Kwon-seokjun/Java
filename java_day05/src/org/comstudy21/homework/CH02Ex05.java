package org.comstudy21.homework;

import java.util.Scanner;

public class CH02Ex05 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 정수 3개입력 -> 삼각형이 되는지 판별한다.
		int a = 0, b = 0, c = 0;
		
		System.out.println("정수 3개를 입력하시오 >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 안됩니다.");
		}
	}
}
