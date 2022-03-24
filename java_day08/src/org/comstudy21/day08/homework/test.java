package org.comstudy21.day08.homework;
import java.util.Scanner; 
public class test  { 
public static void main(String[]args) { 
Scanner scanner = new Scanner(System.in); 
System.out.println("====별찍기 10번===="); 
System.out.print("출력할 줄 수를 입력해주세요:"); 
int userNumber = scanner.nextInt(); 
for(int height = 1; height <= 2*userNumber-1; height++) { 
String stars = ""; 

if(height == 1 || height ==2 * userNumber - 1) { 
//첫줄과 맨 마지막줄 
for(int width = 1; width <= 2*userNumber -1; width++) { 
stars += "*"; 
} 
}else if(height < userNumber) { 
//윗부분 

//userNumber를 5라고 하면 
//2,3,4 가 여기로 들어온다! 
//그럼 height을 1,2,3으로 다른데 담아주면 되겠지 
int upperHeight = height -1; 

//왼쪽부분 별 
for(int width = 1; width <= userNumber-upperHeight; width++) { 
stars += "*"; 
} 
//가운데 공백 
for(int width = 1; width <= 2 * upperHeight -1; width++) { 
stars +=  " "; 
} 


//오른쪽부분 별 
for(int width = 1; width <= userNumber-upperHeight; width++) { 
stars +="*"; 
} 

}else { 
//아랫부분 
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