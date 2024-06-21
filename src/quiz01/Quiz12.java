package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 수 N을 입력받아서 N까지의 구구단 모형의 출력을 완성
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		
		int a = scan.nextInt();
	
		System.out.println("구구단:" + a + "단");
		
		int n = 1;
		
		while( n <= 9 ) {
		
			int sum = a*n;
			
			System.out.println(a + " x " + n + " = " + sum);
		
			n++;
			
		}

	}
}
