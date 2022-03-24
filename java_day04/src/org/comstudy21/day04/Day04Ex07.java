package org.comstudy21.day04;

import java.util.Scanner;

public class Day04Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name,a = "y";
		int age;
		
		while(a.equals("y")) {
		System.out.print("성명 입력 >> ");
		name = scan.next();
		System.out.print("나이 입력 >> ");
		age = scan.nextInt();
		
		System.out.println(name+"님은 "+age+"세 입니다.");
		
		System.out.println("-------------------------");
		
		System.out.print("계속 하시겠습니까? (y/n) >> ");
		a = scan.next();
		}
		
		if(a.equals("n")) {
			System.out.println("수고하셨습니다. 다음 기회에 ...");
		}
		while(!a.equals("n")) {
			System.out.print("계속 하시겠습니까(y/n) >> ");
			a = scan.next();
		}
	}
}