import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
	
	public static void main(String[] args) {
		// while �ݺ���(���� �ݺ���), if��, Scanner
		Scanner scan = new Scanner(System.in);
		int num, k, i=0, count=1;
		
		Random r = new Random();
		k = r.nextInt(100);
		
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������!! (0-99)");
		while (true) {
			try {
				System.out.print(count + " >> ");
				num = scan.nextInt();
				
				if(0 <= num && num <= 99) {
					count++;
					if(num == k) {
						System.out.println("�¾ҽ��ϴ�.");
						System.out.print("�ٽ��Ͻðڽ��ϱ�? (y/n)");
						String text = scan.next();
						if(text.equals("y")) {
							main(null);
						} else if(text.equals("n")) {
							System.out.println("- �����մϴ� -");
							break;
						}
						// ����-
						while(!(text.equals("y") || text.equals("n"))) {
							System.out.print("y �Ǵ� n�� �Է����ּ���!! �ٽ��Ͻðڽ��ϱ�? (y/n) ");
							text = scan.next();
							count=1;
						}
					} else {
						if(num > k) {
							System.out.println("�� �����ϴ�!!");
						} else {
							System.out.println("�� �����ϴ�!!");
						}
					}				
				}else {
		            System.out.println("���� ������ ���� �ʽ��ϴ�.");
		        }
			}
			catch (InputMismatchException e) {
				scan.next();
				System.out.println("���ڸ� �Է����ּ���!!");
			}
		}
	}
	
}
	
