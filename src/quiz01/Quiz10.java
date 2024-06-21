package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		//명인교육의 계산기
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String sum = scan.next(); 
		int b = scan.nextInt();
		
		
		switch(sum) {
			
			case "+": 
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			default:
				System.out.println("잘못입력");							
		}
	}
}
