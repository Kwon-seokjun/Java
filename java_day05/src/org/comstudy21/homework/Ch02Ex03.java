package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex03 {
   Scanner scan = new Scanner(System.in);
   
   public Ch02Ex03() {
      System.out.print("2자리수 정수 입력(10~99)>>");
      int num = scan.nextInt();
      while(num<10 || num>99) {
         System.out.println("경고: 범위를 초과했습니다");
         System.out.print("2자리수 정수 입력(10~99)>>");
         num = scan.nextInt();
      }
      int i = num % 10;
      int j = num / 10;
      if(i == j) {
    	 System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
      } else {
    	  System.out.println("NO! 10의 자리와 1의 자리가 같지않습니다.");
      }
   }
   
   public void ex02() {
      System.out.print("2자리수 정수 입력(10~99)>>");
      int numInt = scan.nextInt();
      while(numInt<10 || numInt>99) {
         System.out.println("경고: 범위를 초과했습니다");
         System.out.print("2자리수 정수 입력(10~99)>>");
         numInt = scan.nextInt();
      }
      String num = ""+numInt;
      if(num.charAt(0) == num.charAt(1)) {
         System.out.println("Yes!");
      } else {
         System.out.println("No!");
      }
   }

   public static void main(String[] args) {
      new Ch02Ex03();
   }

}