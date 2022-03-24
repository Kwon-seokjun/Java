package org.comstudy21.day11;

public class Day11Ex03Array2 {
	int[][] arr = new int[5][5];
	
	public Day11Ex03Array2() {
//		Ex03Test01();
//		Ex03Test02();
//		Ex03Test03();
		Ex03Test04();
	}
	
	public void Ex03Test05() {
		  //   1  2  3  4  5
	      //   16 17 18 19 6
	      //   15 24 25 20 7
	      //   14 23 22 21 8
	      //   13 12 11 10 9
		
	}
	
	public void Ex03Test04() {
		//   1  2  3  4  5
	    //      6  7  8
	    //         9
	    //      10 11 12
	    //   13 14 15 16 17
		
		int number = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = number++;
			}
		}
		//출력
		printArr();
		
//		System.out.print(arr[i][j]!=0 ? arr[i][j] + "\t" : " ");
	}
	
	public void Ex03Test03() {
		int number = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i%2 == 0) {
					arr[i][j] = number++;
				}else {
					arr[i][4-j] = number++;
				}
			}
		}
		//출력
		printArr();
	}
	
	public void Ex03Test02() {
		int number = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][4-j] = number++;
			}
		}
		//출력
		printArr();
	}
	
	public void Ex03Test01() {
		// 1  2  3  4  5
		// 6  7  8  9  10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		int number = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = number++;
			}
		}
		//출력
		printArr();
	}
	
	public void printArr() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]!=0 ? arr[i][j] + "\t" : " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		new Day11Ex03Array2();
	}
}