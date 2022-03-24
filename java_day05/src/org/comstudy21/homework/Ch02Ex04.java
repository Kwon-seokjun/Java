package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex04 {
	public Ch02Ex04() {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		int max = 0, mid = 0, min = 0;
		
		System.out.print("정수 3개를 입력하시오 >> ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(a>b) {
			if(a<c) {
				mid = a;
			}else if(b<c) {
				mid = c;
			} else {
				mid = b;
			}
		} else if(b>a) {
			if(b<c) {
				mid = b;
			} else {
				mid = c;
			}
		} else if (c>a) {
			if(c<b) {
				mid = c;
			} else {
				mid = b;
			}
		} else if(c>b) {
			if(c<a) {
				mid = c;
			} else {
				mid = a;
			}
		} else if(a>c) {
			if(a<b) {
				mid = a;
			} else {
				mid = c;
			}
		}
		System.out.println("중간 값은 " + mid);
	}

	public static void main(String[] args) {
		Ch02Ex04 obj = new Ch02Ex04();
	}
}