package quiz01;

import java.util.Scanner;

public class Quiz16 {
	
	public static void main(String[] args) {
		
		//문자열 합
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String w = scan.next();
		
		String str = ""; //빈 문자열, 문자열 합
		int i = 1;
		
		while( i <= n ) {
			
			str += w;
			
			++i;
			
		}
		
	}

}
