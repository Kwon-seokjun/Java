package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex08Homework {

   public static void main(String[] args) {
      int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
      int total = 0;
      Scanner sc = new Scanner(System.in);
      int month = 0, day = 0;
      
      for(int i=0; i<days.length; i++) {
         total += days[i];
         
      }
      System.out.println("1���� " + total + "�� �Դϴ�");
      
      System.out.print("�� �Է�: ");
      month = sc.nextInt();
      //System.out.printf("%d���� %d�ϱ��� �ִ�.", month, days[month-1]);
      System.out.print("�� �Է�: ");
      day = sc.nextInt();
      total = day-1;
      for(int i=0; i<month-1; i++) {
         total += days[i];
      }
      System.out.printf("1�� 1�Ϻ��� %d�� %d�ϱ����� %d���� �������ϴ�!\n", month, day, total);
      
   }

}