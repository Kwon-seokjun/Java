import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class a {
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);
      Random ra = new Random();
      System.out.println("수를 결정하였습니다. 맞추어보세요.");
      int k = ra.nextInt(100);
      System.out.println("0~99");
      String ch = "";
      int h = 99, r = 0;
      int count = 1;
      int num = 0;

      while (true) {
         try {
            System.out.print(count + ">>");
            num = sc.nextInt();
         
         
         
         if (0 <= num && num <= 99) {
            count++;
            if (k == num) {
               System.out.print("맞았습니다.");
               System.out.print("다시하시겠습니까(y/n)>>");
               ch = sc.next();
               if (ch.equals("y")) {
//                  count = 1;
//                  h=99;
//                  r=0; 
//                  k = ra.nextInt(100);
                  main(null);
               } else if (ch.equals("n")) {
                  System.out.println("종료되었습니다.");
                  break;
               }
            } else if (k < num) {
               System.out.println("더 낮게");
               h = num;
               System.out.printf("%d-%d\n", r, h);
            } else if (k > num) {
               System.out.println("더 높게");
               r = num;
               System.out.printf("%d-%d\n", r, h);
            }
         } else {
            System.out.println("숫자 범위가 맞지 않습니다.");
         }
         } 
          
         catch (InputMismatchException e) {
             sc.nextLine();
             System.out.println("정상적인 숫자를 입력하세요");
          }
      }
   }
}