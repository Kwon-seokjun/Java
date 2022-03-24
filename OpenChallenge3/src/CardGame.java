import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
	
	public static void main(String[] args) {
		// while 반복문(이중 반복문), if문, Scanner
		Scanner scan = new Scanner(System.in);
		int num, k, i=0, count=1;
		
		Random r = new Random();
		k = r.nextInt(100);
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요!! (0-99)");
		while (true) {
			try {
				System.out.print(count + " >> ");
				num = scan.nextInt();
				
				if(0 <= num && num <= 99) {
					count++;
					if(num == k) {
						System.out.println("맞았습니다.");
						System.out.print("다시하시겠습니까? (y/n)");
						String text = scan.next();
						if(text.equals("y")) {
							main(null);
						} else if(text.equals("n")) {
							System.out.println("- 종료합니다 -");
							break;
						}
						// 에러-
						while(!(text.equals("y") || text.equals("n"))) {
							System.out.print("y 또는 n만 입력해주세요!! 다시하시겠습니까? (y/n) ");
							text = scan.next();
							count=1;
						}
					} else {
						if(num > k) {
							System.out.println("더 낮습니다!!");
						} else {
							System.out.println("더 높습니다!!");
						}
					}				
				}else {
		            System.out.println("숫자 범위가 맞지 않습니다.");
		        }
			}
			catch (InputMismatchException e) {
				scan.next();
				System.out.println("숫자만 입력해주세요!!");
			}
		}
	}
	
}
	
