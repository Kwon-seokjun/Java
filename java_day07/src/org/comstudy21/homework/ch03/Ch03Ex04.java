package org.comstudy21.homework.ch03;

public class Ch03Ex04 {
	
	public static void main(String[] args) {
		
	    //   ^^^^*
	    //   ^^^**
	    //   ^^***
	    //   ^****
	    //   *****
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("^");
			}
			for(int b=0; b<i+1; b++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	
	public static void test3(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=6; i>1; i--) {
			for(int j=0; j<i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public static void test2(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i=6; i>1; i--) {
			for(int j=0; j<i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void test1(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int k=0; k<5; k++) {
			for(int b=0; b<k+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
