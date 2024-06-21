package quiz01;

import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		//for문 사용
		
		//1. 7~100까지 정수 중에서 7의 배수를 가로로 출력
		
		 for (int i = 7; i <= 100; i++) {
			 
			 if(i % 7 == 0) {				 
				 System.out.print(i + " ");
			 }
		 }
		 
		 // for (int i = 7; i <= 100; i+=7){}
		
		 System.out.println(); //줄바꿈
		 
		//2. 1~100까지 정수 중에서 9의 배수의 개수를 출력
		 
		 int cnt = 0;
		 
		 for (int i = 1; i <= 100; i++) {
			 
			 if(i % 9 == 0) {
				 cnt++;					 
			 }	 
		 }
		 
		 System.out.println("100까지 9배수의 개수:" + cnt);
		
		//3. 50~100까지 두 수 사이의 합계 출력
		 
		 Scanner scan = new Scanner(System.in);
		
		 int sum = 0;
		 for (int i = 50; i <=100; i++) {
			 sum += i; 
		 }
		 System.out.println("50~100사이의 합:" + sum);
		
		//4. A~Z 문자열의 합 출력
		
		int sum2 = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			sum += c;
			System.out.print(c);
			
		}
		
		System.out.print(sum2);
		
		String str = "";
		for(char i = 'A'; i <= 'Z'; i++) {
			str += i;
		}
		
		System.out.println(str);
		
	}

}
