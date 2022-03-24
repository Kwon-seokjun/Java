package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex01Homework {

	public Day10Ex01Homework() {
		ex01();
	}
	
	public void ex01() {
		Scanner scan = new Scanner(System.in);
		System.out.print("시작단 입력 : ");
		int startDan = scan.nextInt();
		System.out.print("종료단 입력 : ");
		int endDan = scan.nextInt();
		
		while(startDan<2 || startDan>9) {
			System.out.println("단은 2~9사이만 유효");
			System.out.print("시작단 입력 : ");
			startDan = scan.nextInt();
		}
		while(endDan<2 || endDan>9) {
			System.out.println("단은 2~9사이만 유효");
			System.out.print("종료단 입력 : ");
			endDan = scan.nextInt();
		}
		// 시작단이 종료단 보다 크다면 치환한다. (swap)
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
	      // 3행 3열로 구구단 출력
	      for(int dan=startDan; dan<=endDan; dan+=3) {
	         for(int i=0; i<3; i++) {
	            System.out.print((dan+i < endDan+1) ? (dan+i) +"단\t" : "");
	         }
	         System.out.println();
	         for(int i=1; i<=9; i++) {
	            for(int j=0; j<3; j++) {
	               System.out.print(dan+j<endDan+1 ? dan+j + "*"+i+"="+(dan+j)*i +"\t" : "");
	            }
	            System.out.println();
	         }
	      }
	   }
	

	public static void main(String[] args) {
		new Day10Ex01Homework();
	}

}
