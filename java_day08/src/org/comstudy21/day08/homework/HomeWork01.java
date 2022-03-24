package org.comstudy21.day08.homework;

public class HomeWork01 {
	
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			int size = i<=4 ? i+1:9-i;
			for(int j=0; j<size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void ex02(String[] args) {
		/*
		 	*
		 	** 
		 	***
		 	**** 
		 	***** 
		 	****** 
		 	***** 
		 	****
		 	***
		 	**
		 	* 
		 */
		int cnt=1;
		for(int i=0; i<9; i++) {
			for(int j = 0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			cnt = i<4 ? cnt+1: cnt-1;
		}
	}

	public static void ex01(String[] args) {
		// 코딩은 지식이 많다고 잘 하는 것이 아니다. 연습.
		// 기초! 어려울수록 기본으로 간다.
		// 이번주는 제어문, 반복문 연습
		/*
			 *****
			 ****
			 *** 
			 ** 
			 * 
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
