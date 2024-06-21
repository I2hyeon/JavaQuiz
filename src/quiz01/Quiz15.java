package quiz01;

import java.util.Scanner;

public class Quiz15 {
	
	public static void main(String[] args) {
		
		//약수의 합
		
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int i = 1;
		 int sum = 0;
	
		 while ( N >= i) {
			 
			 if ( N % i == 0) {
				 
				 sum += i;
			 }
			 
			 ++i;
			 
		 }
		 
		 System.out.println(sum);
		 
	}

}
