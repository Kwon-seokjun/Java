package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex04_2 {
	
	public Ch02Ex04_2() {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		int max = 0, mid = 0, min = 0;
		
		System.out.print("정수 3개를 입력하시오 >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if(c>max) {
			mid = max; 
			max = c;
		} else if(c<min) {
			mid = min;
			min = c;
		} else {
			mid = c;
		}
		System.out.println("max = " + max);
		System.out.println("mid = " + mid);
		System.out.println("min = " + min);
	}
	public static void main(String[] args) {
		new Ch02Ex04_2();
	}
}
