package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex05Array {
	
	public Day10Ex05Array() {
		ex05();
	}
	
	public void ex05() {
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			intArray[i] = scan.nextInt();
			if(intArray[i]>max) {
				max = intArray[i];
			}
		}
		System.out.println("양수 5개중 최댓값은 " + max + "입니다!");
	}

	public static void main(String[] args) {
		new Day10Ex05Array();
	}

}
