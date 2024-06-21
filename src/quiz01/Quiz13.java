package quiz01;

import java.util.Scanner;

public class Quiz13 {
	
	//개수 세기
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int i = 1;
		int n = 0;

		while ( a >= i ) {
			
			if( i % 4 == 0 && i % 8 != 0) {
				
				n += 1;
			}
			
			i++;
			
			
		}
		
		System.out.println(n);
		
	}

}
