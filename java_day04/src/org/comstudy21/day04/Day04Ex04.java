package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex04 {

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나는 \"Java를 " + 100 + "%\"" + "사랑해");
		
		System.out.printf("시험 점수를 입력 : ");
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("합격입니다~!");
		} else if(score < 80) {
			System.out.println("불합격입니다!");
		} else {
			System.out.println("잘못된 입력입니다");
		}
		
		scanner.close();
	}
}
