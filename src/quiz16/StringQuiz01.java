package quiz16;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력받습니다
		 * 2. 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세요
		 * 3. 아이디는 소문자여야 합니다
		 * 
		 * 아이디가 5글자 이상이면, "아이디가 등록되었습니다"를 출력하고 프로그램 종ㄹ
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용할 ID를 입력해주세요 > ");
		
		
		while(true) {
			
			// 아이디를 입력
			
			String id = sc.nextLine();		
			id = id.replace(" ","").toLowerCase();
			
			if(id.length() < 5) {
				System.out.print("아이디를 5글자 이상으로 다시 입력해주세요(공백 미포함) > ");
			} else {
				System.out.println("아이디 " + id + " 이/가 등록되었습니다");
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}

}
