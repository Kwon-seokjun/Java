import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class a {
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);
      Random ra = new Random();
      System.out.println("���� �����Ͽ����ϴ�. ���߾����.");
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
               System.out.print("�¾ҽ��ϴ�.");
               System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
               ch = sc.next();
               if (ch.equals("y")) {
//                  count = 1;
//                  h=99;
//                  r=0; 
//                  k = ra.nextInt(100);
                  main(null);
               } else if (ch.equals("n")) {
                  System.out.println("����Ǿ����ϴ�.");
                  break;
               }
            } else if (k < num) {
               System.out.println("�� ����");
               h = num;
               System.out.printf("%d-%d\n", r, h);
            } else if (k > num) {
               System.out.println("�� ����");
               r = num;
               System.out.printf("%d-%d\n", r, h);
            }
         } else {
            System.out.println("���� ������ ���� �ʽ��ϴ�.");
         }
         } 
          
         catch (InputMismatchException e) {
             sc.nextLine();
             System.out.println("�������� ���ڸ� �Է��ϼ���");
          }
      }
   }
}