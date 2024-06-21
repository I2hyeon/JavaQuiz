package quiz01;

import java.util.Scanner;

public class Quiz21 {
	
	public static void main(String[] args) {
		
//		int x = 3; // 소수인지 or 아닌지 확인
//		int cnt = 0;
//		for(int i = 1; i <= x; i++) {
//			if(x % i == 0) { //i는 약수
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt == 2 ? "소수" : "소수가 아님");
		
		
		// 느린 소수의 합
		// 숙제
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int sum = 0;
		
		// 디버깅
		start:for(int i = 2; i <= x; i++) {
			
			int cnt = 0; 
	
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) { // i의 약수
					cnt++;
				}
				
				if(cnt > 2) //더 반복문을 돌릴 필요가 없음
					continue start;
			} // 이 반복문을 돌고 나오면, 약수 개수가 나옴
				
			if(cnt == 2) { // i는 소수라고 할 수 있음
				sum += i;
			}
					
			}
	
		System.out.println(sum);
		
	}

}
