package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Game {
	String name = "���������� ����";
	// ����� �����Ѵ�.
	final String ���� = "����", ���� = "����", �� = "��";
	Scanner scan = new Scanner(System.in);
	public Ch02Game() {
		// �����ڰ� ���� ����� �� ����Ʈ ������
		// ������ - ��ü�� ����� �ʱ�ȭ �ϴ� ����
		// �����ڴ� ��ü�� �����ɶ� (new��� ��) �ڵ� ȣ��.
		// TDD - �׽�Ʈ �ֵ� ����
		// ��ü�� ����̹Ƿ� static�� ������� ���� ����� ȣ�� �����ϴ�.
		String user1Name = "ö��";
		String user2Name = "����";
		
		System.out.println("::: "+name+" :::");
		System.out.print(user1Name + " >> ");
		String user1 = scan.next();
		System.out.print(user2Name + " >> ");
		String user2 = scan.next();
		// ���������� ��
		switch(user1) {
		case ���� :
			switch(user2) {
			case ���� : System.out.println(user2Name+"�� �̰���ϴ�."); break;
			case �� : System.out.println(user1Name+"�� �̰���ϴ�."); break;
			}
			break;
		case ���� :
			switch(user2) {
			case ���� : System.out.println(user1Name+"�� �̰���ϴ�."); break;
			case �� : System.out.println(user2Name+"�� �̰���ϴ�."); break;
			}
			break;
		case �� :
			switch(user2) {
			case ���� : System.out.println(user2Name+"�� �̰���ϴ�."); break;
			case ���� : System.out.println(user1Name+"�� �̰���ϴ�."); break;
			}
			break;
		}
		if (user1.equals(user2)) System.out.println("�����ϴ�.");
	}
	
	public static void main(String[] args) {
		// Ch02Game Ŭ������ ��ü ���� - �����ڰ� �ڵ� ȣ��
		// main�� �ۼ����� �ʰ� Constructor�� ���� �Ѵ�.
		new Ch02Game(); // <--- Ŭ������ �����ڸ� ȣ�� (��ü ����)
		
	}
}
