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
      System.out.println("1년은 " + total + "일 입니다");
      
      System.out.print("월 입력: ");
      month = sc.nextInt();
      //System.out.printf("%d월은 %d일까지 있다.", month, days[month-1]);
      System.out.print("일 입력: ");
      day = sc.nextInt();
      total = day-1;
      for(int i=0; i<month-1; i++) {
         total += days[i];
      }
      System.out.printf("1월 1일부터 %d월 %d일까지는 %d일이 지났습니다!\n", month, day, total);
      
   }

}