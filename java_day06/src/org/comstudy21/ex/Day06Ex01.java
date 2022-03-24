package org.comstudy21.ex;

import java.util.Scanner;

public class Day06Ex01 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		
		System.out.println("첫번째 좌표(x1, y1) >> ");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		System.out.println("두번째 좌표(x2, y2) >> ");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		boolean p1 = inRect(x1, y1, 100, 100, 200, 200);
		boolean p2 = inRect(x2, y2, 100, 100, 200, 200);
		boolean p3 = inRect(x1, y2, 100, 100, 200, 200);
		boolean p4 = inRect(x2, y1, 100, 100, 200, 200);
		
		System.out.println(p1 + ", " + p2 + ", " + p3 + ", " + p4);
		if(p1 || p2 || p3 || p4) {
			System.out.println("포함 되었다.");
		} else {
			System.out.println("포함 되지 않았습니다.");
		}
	}
}
