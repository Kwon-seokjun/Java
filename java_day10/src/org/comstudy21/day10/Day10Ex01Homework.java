package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex01Homework {

	public Day10Ex01Homework() {
		ex01();
	}
	
	public void ex01() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���۴� �Է� : ");
		int startDan = scan.nextInt();
		System.out.print("����� �Է� : ");
		int endDan = scan.nextInt();
		
		while(startDan<2 || startDan>9) {
			System.out.println("���� 2~9���̸� ��ȿ");
			System.out.print("���۴� �Է� : ");
			startDan = scan.nextInt();
		}
		while(endDan<2 || endDan>9) {
			System.out.println("���� 2~9���̸� ��ȿ");
			System.out.print("����� �Է� : ");
			endDan = scan.nextInt();
		}
		// ���۴��� ����� ���� ũ�ٸ� ġȯ�Ѵ�. (swap)
		if(startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
	      // 3�� 3���� ������ ���
	      for(int dan=startDan; dan<=endDan; dan+=3) {
	         for(int i=0; i<3; i++) {
	            System.out.print((dan+i < endDan+1) ? (dan+i) +"��\t" : "");
	         }
	         System.out.println();
	         for(int i=1; i<=9; i++) {
	            for(int j=0; j<3; j++) {
	               System.out.print(dan+j<endDan+1 ? dan+j + "*"+i+"="+(dan+j)*i +"\t" : "");
	            }
	            System.out.println();
	         }
	      }
	   }
	

	public static void main(String[] args) {
		new Day10Ex01Homework();
	}

}
