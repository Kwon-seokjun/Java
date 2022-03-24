package org.comstudy21;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// 스케너 선언
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("도시 입력: ");
		String city = scan.next();
		System.out.println("사는곳은 "+ city + "입니다.\n");
		
		System.out.printf("나이 입력: ");
		String age = scan.next();
		System.out.println("나이는 "+ age + "살 입니다.\n");
		
		System.out.printf("목표 입력: ");
		String as = scan.next();
		System.out.println("목표는 "+ as + "입니다.\n");
		
		// scan을 닫아 준다.
		scan.close();
	}
}
