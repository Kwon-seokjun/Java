package org.comstudy21.day08.homework;

public class HomeWork01 {
	
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			int size = i<=4 ? i+1:9-i;
			for(int j=0; j<size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void ex02(String[] args) {
		/*
		 	*
		 	** 
		 	***
		 	**** 
		 	***** 
		 	****** 
		 	***** 
		 	****
		 	***
		 	**
		 	* 
		 */
		int cnt=1;
		for(int i=0; i<9; i++) {
			for(int j = 0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			cnt = i<4 ? cnt+1: cnt-1;
		}
	}

	public static void ex01(String[] args) {
		// �ڵ��� ������ ���ٰ� �� �ϴ� ���� �ƴϴ�. ����.
		// ����! �������� �⺻���� ����.
		// �̹��ִ� ���, �ݺ��� ����
		/*
			 *****
			 ****
			 *** 
			 ** 
			 * 
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
