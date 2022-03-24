package org.comstudy21.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10Ex04 {

	public static int getInt() {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
		while(true) {
			try {
				
				number = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println(">>> 예외 발생 : 정수만 입력 하세요");
				// 버퍼에 남아있는 문자를 제거한다.
				scan.next();
				continue;
			}
		}
		scan.close();
		return number;
	}
	public static void main(String[] args) {
		System.out.print("정수입력 : ");
		int num = getInt();
		System.out.println("num = " + num);
	}
}
