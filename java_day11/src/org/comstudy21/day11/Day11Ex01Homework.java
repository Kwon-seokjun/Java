package org.comstudy21.day11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day11Ex01Homework {
	public static final Random rand = new Random();
	public static final Scanner scan = new Scanner(System.in);
	public static final int SIZE = 6, MAX = 6;

	public Day11Ex01Homework() {
		System.out.print("���� >> ");
		switch(scan.nextInt()) {
		case 1 : lotto01(); break;
		case 2 : lotto02(); break;
		case 3 : lotto03(); break;
		}
	}
	
	public void lotto03() {
		int[] ball = new int[MAX];
		for(int i=0, num=1; i<MAX; i++) {
			ball[i] = num++;
		}
//		System.out.println(Arrays.toString(ball));
		int[] lotto = new int[SIZE];
		int cnt = 0;
		while(cnt<SIZE) {
			int index = rand.nextInt(MAX);
			if(ball[index] != 0) {
				lotto[cnt] = ball[index];
				ball[index] = 0;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public void lotto02() {
		int[] lotto = new int[SIZE];
		int cnt = 0;
		
		while(cnt<SIZE) {
			int number = 1 + rand.nextInt(MAX);
			// ���� ������ number�� ���� lotto �迭�� ���� ���� �ֳ�?
			boolean flag = true;
			for(int i=0; i<cnt; i++) {
				if(lotto[i] == number) {
					flag = false;
					break;
				}
			}
			if(flag) {
				lotto[cnt] = number;
				cnt += 1;
			}
		}
//		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	public void lotto01() {
		int[] lotto = new int[SIZE];
		// 1. ������ �ݺ��ؼ� ������ �߻� ��Ų��.
		// 2. �߻��� ������ �迭 lotto�� ������� ���� �Ѵ�.
		// 3. �߻� ��Ų ������ �̹� lotto�� ����� ���� ���� ���̸� �ٽ� ����. (2�� �ݺ�)
		// 4. �ٽ� ������ ������ lotto�� ����� ����� �ٽ� ���Ѵ�. (index �ʱ�ȭ)
		
		for(int cnt=0; cnt<6; cnt++) {
			lotto[cnt] = 1 + rand.nextInt(MAX);
			for(int i=0; i<cnt; i++) {
				if(lotto[i] == lotto[cnt]) {
					lotto[cnt] = 1 + rand.nextInt(MAX);
					i = -1;
				}
			}
		}
//		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main(String[] args) {
		new  Day11Ex01Homework();
	}

}
