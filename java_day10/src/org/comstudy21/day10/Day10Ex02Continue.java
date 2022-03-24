package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex02Continue {

	public Day10Ex02Continue() {
		// 정수 5개를 입력 받는다.
		// 입력 된 정수 중에 양수만을 누적한다. (continue 활용)
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int n = 0;
		
		System.out.println("정수 5개 입력하세요");
		for(int i=0; i<5; i++) {
			n = scan.nextInt();
			if(n < 0) {
				continue;
			} else {
				total += n;
			}
		}
		System.out.println("양수 값은(total) = " + total);
	}
	
	public static void main(String[] args) {
		new Day10Ex02Continue();
	}

}
