package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("1 ~ 99������ ������ �Է��Ͻÿ� >> ");
		int number = scan.nextInt();
		
		int i = number % 10;
		int j = number / 10;
		
		System.out.print("�ڼ�");
		if(i % 3 == 0) {
			System.out.print("¦");
		}
		if(j % 3 == 0) {
			System.out.print("¦");
		}
	}
}
