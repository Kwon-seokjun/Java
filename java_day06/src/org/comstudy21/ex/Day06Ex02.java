package org.comstudy21.ex;

import java.util.Scanner;

public class Day06Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		double r = 0;
		int px = 0, py = 0;
		
		System.out.println("���� �߽ɰ� ������ �Է� >> ");
		x = scan.nextInt();
		y = scan.nextInt();
		r = scan.nextDouble();
		System.out.println("�� �Է� >> ");
		px = scan.nextInt();
		py = scan.nextInt();
		
		double dist = Math.sqrt(((x-px)*(x-px) + (y-py)*(y-py)));
	      if(dist < r) {
	         System.out.println("�� �ȿ� �ִ�.");
	      } else {
	         System.out.println("�� �ۿ� �ִ�.");
	      }
	}
}
