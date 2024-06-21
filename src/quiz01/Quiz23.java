package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		/*
		 * updown게임
		 * 
		 * 1~100까지 임의의 숫자를 하나 생성합니다. (정답 값 이라고 가정)
		 * 
		 * 스캐너를 통해서 값을 입력받고,
		 * 랜덤수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도 횟수를 출력하고, 종료하면 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = (int)(Math.random())*100 + 1; // 정답
		int cnt = 0;
		
		while(true) {
			System.out.print("정답입력>");
			int s = scan.nextInt();
			cnt++; // 시도 횟수
			
			if(s > n) {
				System.out.println("더 작은 수를 입력하세요");
			} else if(s < n) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("정답입니다");
				break;
			}
			
		}
		
		System.out.println("시도횟수:" + cnt);
		
	}
}
