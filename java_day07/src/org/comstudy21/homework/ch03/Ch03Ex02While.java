package org.comstudy21.homework.ch03;

public class Ch03Ex02While {

	public static void test(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 = 55
		// 누적되는 변수는 초기화 해야 한다.
		int sum = 0;
		int number=1;
		while(number<=10) {
			sum += number; // sum = sum+number
			System.out.print(number);
			if(number<10) {
			System.out.print("+");
			} else {
				System.out.print("=");
			}
			number++; // 반복 후 실행문
		} // end of for
		System.out.print(sum);
	}
	
	
	public static void main(String[] args) {
		// 1+2-3+4-5+6-7+8-9+10=7
		int sum=2;
		int i=1;
		while( i<=10 ) {
			System.out.print(i);
			if(i%2!=0) {
				sum -= i;
				System.out.print("+");
			} else {
				sum += i;
				System.out.print((i==10)?"=":"-");
			}
			i++;
		} // end of for
		System.out.println(sum);
	}

}
