package org.comstudy21.homework.ch03;

public class Ch03Ex03 {

	public static void main(String[] args) {
		// �Ǻ���ġ ����
		// 1+1+2+3+5+8+13+21=54
		// �ǻ��ڵ� - �ΰ��� ���� ���� �ڵ��ϱ�
		
		int prev = 0, cur = 1, next = 0;
		int total = 0;
		while(cur<=21) {
			total += cur;
			System.out.print(cur);
			if(cur == 21) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
			// ������ ���ϱ� ���������� ������ �����
			// �������� ���������� �������� ���������� ����
			next = prev + cur;
			prev = cur;
			cur = next;
		} // end of while
		System.out.println(total);
	}
}
