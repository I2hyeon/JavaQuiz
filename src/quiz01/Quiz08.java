package quiz01;

import java.util.Scanner;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		//홀수 짝수 0 찾기
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if ( a == 0 ) {
			System.out.println("제로");
		} else if ( a < 0 ) {
			System.out.println("음수");
		} else if ( a % 2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		scan.close();
	}

}
