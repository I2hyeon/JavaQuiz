package quiz01;

import java.util.Scanner;

public class Quiz17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1000, 500, 100, 50, 10};
		int x = scan.nextInt();
		int i = 0;
		
		while( i < arr.length ) {
			
			int n = x/arr[i];
				
			System.out.print( arr[i] + " " + n + " " );
			
			x %= arr[i];
					
			i++;
			
		}
		
	}

}