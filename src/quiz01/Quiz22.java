package quiz01;

import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면, 랜덤한 덧셈 문제를 출력해줍니다.
		 * 이 랜덤한 수의 범위는 1~100 사이의 값
		 * 
		 * 사용자가 답안을 입력할 때마다, 정답 또는 오답 카운트가 누적됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);

		int cnt1 = 0;
		int cnt2 = 0;
		
		
		while(true) {
			
			// 랜덤한 문제 생성
			System.out.println("--------------");
			
			int x = (int)(Math.random() * 100) + 1;
			int y = (int)(Math.random() * 100) + 1;
			
			System.out.println(x + " + " + y + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print("> ");
			
			// 입력
			int s = scan.nextInt();
			
			// 비교
			
			if(s == 0) { // 문제를 그만 풀고 싶은 경우 위에 적어야 오답이 카운트 되지 않음
				System.out.println("프로그램 정상 종료"); 
				break;
			}
			
			if(x+y == s) { // 정답인 경우
				System.out.println("정답입니다");
				cnt1++;
			} else if(x+y != s) { // 정답이 아닌 경우
				System.out.println("틀렸는데요?");
				cnt2++;
			}
			
		}
		
		System.out.println("정답:" + cnt1);
		System.out.println("오답:" + cnt2);
		
	}
}
