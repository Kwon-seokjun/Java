package org.comstudy21.day10;

public class Day10Ex03Break {

	public Day10Ex03Break() {
		ex01();
	}
	
	public void ex01() {
		AA:
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				if(j==2) break AA;
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Day10Ex03Break();
	}

}
