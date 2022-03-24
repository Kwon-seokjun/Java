package org.comstudy.day09;

import java.util.Scanner;

public class Day09Ch03Ex01 {

	public Day09Ch03Ex01() {
		// 디폴트 생성자
		ex01();
	}
	private void ex01() {
		int count=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 -1를 입력하세요!");
		int n = scan.nextInt();
		
		while(n != -1) {
			sum += n;
			count++;
			n = scan.nextInt();
		}
		if(count == 0) {
			System.out.println("정수를 입력하세요!");
			main(null);
		}else {
			double avg = sum/(double)count;
		System.out.println("정수의 개수는 "+count+"개이며 평균은 "+avg+"입니다.");
		}
	}
	public static void main(String[] args) {
		new Day09Ch03Ex01();
	}

}
