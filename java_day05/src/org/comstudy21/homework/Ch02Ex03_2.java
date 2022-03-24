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
		
		// Map�� �̿��� ����.
		// �ڹ��� ��ǥ���� �÷��� set, map, list ...
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(50000, "����");
		map.put(10000, "����");
		map.put(5000, "��õ");
		map.put(1000, "õ");
		map.put(500, "����");
		map.put(100, "��");
		map.put(50, "����");
		map.put(10, "��");
		map.put(5, "��");
		map.put(1, "��");
		
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		price = scan.nextInt();
		carry = price;
		while(pay > 0) {
			System.out.println(map.get(pay) + "���� " + carry/pay);
			carry %= pay;
			pay /= k;
			k = (k==5) ? 2 : 5;
		}
	}
	
	public static void main(String[] args) {
		new Ch02Ex03_2();
	}
}
