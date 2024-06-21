package quiz15;

import java.util.Scanner;

public class TryCatch02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int target = (int)(Math.random()*100) + 1;
		int count = 0;
		
		while(true)			
			
			try {
				
				System.out.print("1과 100 사이의 값을 입력하세요>");
				int a = sc.nextInt(); // 입력
				count++; // 시도횟수 증가

				
				if(target < a) {
					System.out.println("더 작은 수를 입력하세요");
					
				} else if (target == a) {
					System.out.println("정답입니다");
					System.out.println("시도 횟수는:" + count);
					break;
				} else {
					System.out.println("더 큰 수를 입력하세요");
				}
				
				
			} catch (Exception e) {
				
				System.out.println("잘못 입력했습니다");
				sc.nextLine();
				count++; // 시도횟수 증가
				
			}		
		
			
	}

}
