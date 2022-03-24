package org.comstudy21.homework.ch03;

public class Ch03Ex01For {
	
	public static void test2(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10= 7
		int sum = 0;

		for(int i=10; i>0; i--) {
			
			if(i % 2 == 0) {
				System.out.printf("%d+",i);
				sum += i;
			}else {
				System.out.printf("%d-",i);
				sum -= i;
			}
			
//			if(i<10) {
//				if(i % 2 == 0) {
//					System.out.print("-");
//				} else {
//					System.out.print("+");
//				}
//			} else {
//				System.out.print("=");
//			}

		}
		System.out.println("sum : "+sum);
	}
	public static void test3(String[] args) {
	    int sum = 0;
	    
	    for(int i = 1; i <= 10; i++){
	        
	        if(i%2 == 0){
	        	System.out.printf("+%d",i);
	        	sum += i;
	        }
	        else{
	        	System.out.printf("-%d",i);
	        	sum -= i;
	        }
	        
	    }
	    System.out.printf("=%d",sum);
	}
	public static void main(String[] args) {
	      // 1+2-3+4-5+6-7+8-9+10=7
	      int sum=2;
	      for(int i=1; i<=10; i++) {
	         System.out.print(i);
	         if(i%2!=0) {
	            sum -= i;
	            System.out.print("+");
	         } else {
	            sum += i;
	            System.out.print((i==10)?"=":"-");
	         }
	      } // end of for
	      System.out.println(sum);
	   }


	public static void test(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 = 55
		// 누적되는 변수는 초기화 해야 한다.
		int sum = 0;
		for(int number=1; number<=10; number++) {
			sum += number; // sum = sum+number
			System.out.print(number);
			if(number<10) {
			System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}

}
