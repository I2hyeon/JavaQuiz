package quiz01;

import java.util.Scanner;

public class Quiz25 {
	
	public static void main(String[] args) {
		
		// 백준 1차원 배열 10818번 문제
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = scan.nextInt();		
		} // 배열 생성
		
		/* 
		 * 또는 while을 사용해서 
		 * while(i < arr.length) {
		 * 		arr[i] = scan.nextInt();
		 * 		i++;
		 * }
		 */
		
		int max = arr[0]; // 배열의 첫번째 요소
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(min > arr[i]) {
				min = arr[i]; // 최소값
			} 
			
			if(max < arr[i]) {
				max = arr[i]; // 최대값
			}
			
		}
		
		System.out.println(min + " " + max);
		
		scan.close();
		
	}

}
