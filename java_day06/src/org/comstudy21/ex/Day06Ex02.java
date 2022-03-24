package org.comstudy21.ex;

import java.util.Scanner;

public class Day06Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		double r = 0;
		int px = 0, py = 0;
		
		System.out.println("원의 중심과 반지름 입력 >> ");
		x = scan.nextInt();
		y = scan.nextInt();
		r = scan.nextDouble();
		System.out.println("점 입력 >> ");
		px = scan.nextInt();
		py = scan.nextInt();
		
		double dist = Math.sqrt(((x-px)*(x-px) + (y-py)*(y-py)));
	      if(dist < r) {
	         System.out.println("원 안에 있다.");
	      } else {
	         System.out.println("원 밖에 있다.");
	      }
	}
}
