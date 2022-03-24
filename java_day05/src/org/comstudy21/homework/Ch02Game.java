package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Game {
	String name = "가위바위보 게임";
	// 상수를 선언한다.
	final String 가위 = "가위", 바위 = "바위", 보 = "보";
	Scanner scan = new Scanner(System.in);
	public Ch02Game() {
		// 개발자가 직접 만들어 준 디폴트 생성자
		// 생성자 - 객체의 멤버를 초기화 하는 역할
		// 생성자는 객체가 생성될때 (new사용 시) 자동 호출.
		// TDD - 테스트 주도 개발
		// 객체의 멤버이므로 static을 사용하지 않은 멤버도 호출 가능하다.
		String user1Name = "철수";
		String user2Name = "영희";
		
		System.out.println("::: "+name+" :::");
		System.out.print(user1Name + " >> ");
		String user1 = scan.next();
		System.out.print(user2Name + " >> ");
		String user2 = scan.next();
		// 가위바위보 비교
		switch(user1) {
		case 가위 :
			switch(user2) {
			case 바위 : System.out.println(user2Name+"가 이겼습니다."); break;
			case 보 : System.out.println(user1Name+"가 이겼습니다."); break;
			}
			break;
		case 바위 :
			switch(user2) {
			case 가위 : System.out.println(user1Name+"가 이겼습니다."); break;
			case 보 : System.out.println(user2Name+"가 이겼습니다."); break;
			}
			break;
		case 보 :
			switch(user2) {
			case 가위 : System.out.println(user2Name+"가 이겼습니다."); break;
			case 바위 : System.out.println(user1Name+"가 이겼습니다."); break;
			}
			break;
		}
		if (user1.equals(user2)) System.out.println("비겼습니다.");
	}
	
	public static void main(String[] args) {
		// Ch02Game 클래스의 객체 생성 - 생성자가 자동 호출
		// main에 작성하지 않고 Constructor에 구현 한다.
		new Ch02Game(); // <--- 클래스의 생성자를 호출 (객체 생성)
		
	}
}
