package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		// 두 수 사이의 합
		
		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int sum = 0;
//		
//		if(num1 == num2) {
//			sum = 0;
//		}
//		
//		if(num1 > num2) {
//			for(int i = num2; i <= num1; i++) {
//				sum += i;			
//		}} 
//		
//		if(num1 < num2)
//			for(int i = num1; i <= num2; i++) {
//			sum += i;
//			}
//	
//		System.out.println(sum);
		
		// 다른 풀이
		
		int a = scan.nextInt();
		int b = scan.nextInt();
			
		int max = 0; // max, min 변수 잡아주고 대소관계에 따라 할당하기
		int min = 0;
		int sum = 0; // 합계
		
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println( max == min ? 0 : sum);
		}	
	}

