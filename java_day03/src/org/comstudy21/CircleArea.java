package org.comstudy21;

import java.util.Scanner;

public class CircleArea {
	
	// main 밖에서 선언할 때는 static 붙여서 선언
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 평을 입력받아서 제곱미터를 출력하는 프로그램
		// 1평은 약 3.30579미터이다.
		// 제곱미터를 입력받아서 평을 출력하는 프로그램 구현.
		final double 평 = 3.30579;
		double r = 0;
		double result = 0;
		
		System.out.println("---평수 계산기---\n");
		
		System.out.printf("평수 입력: ");
		r = scan.nextDouble();
		
		result = r * 평;
		
		// System.out.println(r+"평의 제곱미터는 " + result+"입니다.");
		
		System.out.printf("%.0f평의 제곱미터는 %f입니다.\n\n", r, result);
		// -----------------------------------
		
		System.out.printf("제곱미터 입력: ");
		r = scan.nextDouble();
		
		result = r / 평;
		
		// System.out.println(r+"제곱미터의 평수는 " + result+"입니다.");
		
		System.out.printf("%f제곱미터의 평수는 %.0f입니다.", r, result);
	}

	public static void ex01(String[] args) {
		// 상수 PI 선언 - Math.PI로도 가능
		final double PI = 3.141592;
		double r = 10;
		double circleArea = 0;
		
		// 키보드로 반지름을 입력받아서 사용 하기
		System.out.print("반지름 입력: ");
		r = scan.nextDouble();
		
		// 연산하기 - 반지름을 이용해서 면적을 구한다.
		// 항과 연산자 사이에는 공백 없어도 된다.
		// 가독성을 위한 띄어쓰기
		circleArea = r * r * PI;
		
		// 결과 출력
		// System.out.println("반지름이 "+r+"인 원의 면적은 ");
		// System.out.println(circleArea+"입니다.");
		// println() 대신 printf()로 사용(print format 사용)
		
		// System.out.printf("반지름이 %.1f인 원의 넓이는 %.4f입니다.\n", r, circleArea);
		
		String msg = String.format("반지름이 %.1f인 원의 넓이는 %.4f입니다.\n", r, circleArea);
		
		System.out.println(msg);

	}

}
