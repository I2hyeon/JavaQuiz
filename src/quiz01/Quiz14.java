package quiz01;

import java.util.Scanner;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		//배수 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt(); //반복 횟수
		int n = scan.nextInt(); //배수
		int i = 1;
		int a = x/n;
		
		while( a >= i ) {
			
			System.out.print(n*i + " ");
			
			++i;
			
		}
		
		/* 
		 * 다른 풀이 1)
		 * 
		 * while(i <= x) {
		 * 
		 *   	if( i % n == 0 ) {
		 *   		System.out.prin(i + " ");
		 *  	}
		 * 
		 * 		i++;
		 * 
		 * 다른 풀이 2)
		 * 
		 * int i = n; (ex) n=3이면 3부터 시작함
		 * while(i <= x) {
		 * 		System.out.println(i + " ");
		 * 		
		 *      i += n;
	    */
	
	}

}
