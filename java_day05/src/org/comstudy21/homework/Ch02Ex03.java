package org.comstudy21.homework;

import java.util.Scanner;

public class Ch02Ex03 {
   Scanner scan = new Scanner(System.in);
   
   public Ch02Ex03() {
      System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
      int num = scan.nextInt();
      while(num<10 || num>99) {
         System.out.println("���: ������ �ʰ��߽��ϴ�");
         System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
         num = scan.nextInt();
      }
      int i = num % 10;
      int j = num / 10;
      if(i == j) {
    	 System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
      } else {
    	  System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
      }
   }
   
   public void ex02() {
      System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
      int numInt = scan.nextInt();
      while(numInt<10 || numInt>99) {
         System.out.println("���: ������ �ʰ��߽��ϴ�");
         System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
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