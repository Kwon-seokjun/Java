package org.comstudy21.day10;

import java.util.Arrays;
import java.util.Random;

public class Day10Ex07Lotto {
	public static final int MAX = 6;
	public static final int SIZE = 6;

	public static void main(String[] args) {
		Random rand = new Random(); // 난수 발생기
		int[] lotto = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			int n = rand.nextInt(MAX) + 1;
			lotto[i] = n;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					continue;
				}
			}
		}
		for (int num : lotto) {
		}
		System.out.println(Arrays.toString(lotto));
	}
}