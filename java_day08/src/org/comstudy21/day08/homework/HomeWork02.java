package org.comstudy21.day08.homework;

public class HomeWork02 {
	
	public static void homework01(String[] args) {
	 /* ¼÷Á¦ 1)
        ^^^^*
        ^^^**
        ^^***
        ^****
        *****
        ^****
        ^^***
        ^^^**
        ^^^^*
      */
		for(int i=0; i<9; i++) { 
			if(i<5) {
				
				for(int j=0; j<4-i + i+1; j++) {
					System.out.print(j<4-i ? "^":"*");
				}
			} else {
				for(int j=0; j<i + 5-i; j++) {
					System.out.print(j<i-4 ? "^":"*");
				}
			}
			System.out.println();
		}
	}
	
	public static void homework02(String[] args) {
	/* ¼÷Á¦ 2
        *********
        ^*******
        ^^*****
        ^^^***
        ^^^^*
    */
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("^");
			}
			for(int j=0; j<(5-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void homework03(String[] args) {
	/* 
	      ¼÷Á¦ 3
	        ^^^^*
	        ^^^***
	        ^^*****
	        ^*******
	        *********
	        ^*******
	        ^^*****
	        ^^^***
	        ^^^^*
	 */
		for(int i=0; i<9; i++) { 
			if(i<5) {
				for(int j=0; j<4-i + (i+1)*2-1; j++) {
					System.out.print(j<4-i ? "^":"*");
				}
			} else {
				for(int j=0; j<i + (6-i+1)*2-1; j++) {
					System.out.print(j<i-4 ? "^":"*");
				}
			}
			System.out.println();
		}
	}
	
	public static void homework04(String[] args) {
	/* 
	     ¼÷Á¦ 4
	        *********
	        **** ****
	        ***   ***
	        **     **
	        *       *
	        **     **
	        ***   ***
	        **** ****
	        *********
	*/
			for(int i=0; i<9; i++) { 
				if(i<5) {
					for(int j=0; j<4-i + i+1; j++) {
						System.out.print(j<5-i ? "*":" ");
					}
					for(int j=0; j<4-i + i ; j++) {
						System.out.print(j<i-1 ? " ":"*");
					}
				} else {
					for(int j=0; j<i + 5-i; j++) {
						System.out.print(j<i-3 ? "*":" ");
					}
					for(int j=0; j<3-i + i+1; j++) {
						System.out.print(j<7-i ? " ":"*");
					}

				}
				System.out.println();
		}
	}
	
	public static void homework05(String[] args) {
	/* 
	     ¼÷Á¦ 5
	        Å©±âÀÔ·Â(È¦¼ö¸¸) : 
			*********
			*  * *  *
			* *   * *
			**     **
			*       *
			**     **
			* *   * *
			*  * *  *
			********* 
	*/
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	/*
		¼÷Á¦ 8
           	*       *
           ***     ***
          *****   *****
         ******* *******
        *****************
	 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i+1)*2-1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<(4-i)*2-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i+1)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void homework(String[] args) {
     /* 
     ¼÷Á¦ 6 
        *********
        **     **
        * *   * *
        *  * *  *
        *   *   *
        *  * *  *
        * *   * *
        **     **
        *********
     
     ±¸±¸´Ü
     ½ÃÀÛ´Ü : 2
     Á¾·á´Ü : 9
     */

	}
	
	public static void ex05(String[] args) {
		/*
	        ^^^^*
	        ^^^***
	        ^^*****
	        ^*******
	        *********
	    */
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print("^");
			}
			for(int j=0; j<(i+1)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void ex04(String[] args) {
		
		for(int row=0; row<9; row++) {
			int size = row<4 ? row :8-row ;
			for(int col=0; col<size; col++) {
				System.out.print(col<size ? "^" : "*");
			}
			System.out.println();
		}
	}
	
	public static void ex03(String[] args) {
		/*
			*****
			^****
			^^***
			^^^**
			^^^^*
			^^^**
			^^***
			^****
			*****
		 */

		for(int i=0; i<9; i++) {
			 
			if(i<5) {
				for(int j=0; j<i + 5-i; j++) {
					System.out.print(j<i ? "^":"*");
				}
			} else {
				for(int j=0; j<4-i + i+1; j++) {
					System.out.print(j<8-i ? "^":"*");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex02(String[] args) {
		/*
			*****
			^****
			^^***
			^^^**
			^^^^*
	 	*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<i + 5-i; j++) {
				System.out.print(j<i ? "^":"*");
			}
			System.out.println();
		}
	}

	public static void ex01(String[] args) {
		/*
		 	^^^^*
		 	^^^**
		 	^^***
		 	^****
		 	*****
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i + i+1; j++) {
				System.out.print(j<4-i ? "^":"*");
			}
			System.out.println();
		}

	}

}
