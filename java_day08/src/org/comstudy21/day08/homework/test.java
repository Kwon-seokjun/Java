package org.comstudy21.day08.homework;
import java.util.Scanner; 
public class test  { 
public static void main(String[]args) { 
Scanner scanner = new Scanner(System.in); 
System.out.println("====����� 10��===="); 
System.out.print("����� �� ���� �Է����ּ���:"); 
int userNumber = scanner.nextInt(); 
for(int height = 1; height <= 2*userNumber-1; height++) { 
String stars = ""; 

if(height == 1 || height ==2 * userNumber - 1) { 
//ù�ٰ� �� �������� 
for(int width = 1; width <= 2*userNumber -1; width++) { 
stars += "*"; 
} 
}else if(height < userNumber) { 
//���κ� 

//userNumber�� 5��� �ϸ� 
//2,3,4 �� ����� ���´�! 
//�׷� height�� 1,2,3���� �ٸ��� ����ָ� �ǰ��� 
int upperHeight = height -1; 

//���ʺκ� �� 
for(int width = 1; width <= userNumber-upperHeight; width++) { 
stars += "*"; 
} 
//��� ���� 
for(int width = 1; width <= 2 * upperHeight -1; width++) { 
stars +=  " "; 
} 


//�����ʺκ� �� 
for(int width = 1; width <= userNumber-upperHeight; width++) { 
stars +="*"; 
} 

}else { 
//�Ʒ��κ� 
//height = 5, 6, 7, 8 
int lowerHeight = height - userNumber + 1; 
//= lowerHeight = 1, 2, 3, 4 

for(int width =1; width <= lowerHeight; width++) { 
stars += "*"; 
} 
for(int width = 1; width <= 2 * userNumber -1 - 2* lowerHeight; width++) { 
stars += " "; 
} 

for(int width = 1; width <= lowerHeight; width++) { 
stars += "*"; 
} 
} 

System.out.println(stars); 

} 


scanner.close(); 
} 
}