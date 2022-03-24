package org.comstudy21.homework;

import java.util.HashMap;
import java.util.Scanner;

public class Ch02Ex03_2 {
	Scanner scan = new Scanner(System.in);
	
	public Ch02Ex03_2() {
		int price = 0;
		int carry = 0;
		int pay = 50000;
		int k = 5;
		
		// Map을 이용해 본다.
		// 자바의 대표적인 컬렉션 set, map, list ...
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(50000, "오만");
		map.put(10000, "오만");
		map.put(5000, "오천");
		map.put(1000, "천");
		map.put(500, "오백");
		map.put(100, "백");
		map.put(50, "오십");
		map.put(10, "십");
		map.put(5, "오");
		map.put(1, "일");
		
		System.out.print("금액을 입력하시오 >> ");
		price = scan.nextInt();
		carry = price;
		while(pay > 0) {
			System.out.println(map.get(pay) + "원권 " + carry/pay);
			carry %= pay;
			pay /= k;
			k = (k==5) ? 2 : 5;
		}
	}
	
	public static void main(String[] args) {
		new Ch02Ex03_2();
	}
}
