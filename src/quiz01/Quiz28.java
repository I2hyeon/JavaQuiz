package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz28 {
	
	public static void main(String[] args) {
		
		/*
		 * 사용자에게 수정할 이름을 입력받아서 
		 * 해당 이름이 존재하면, 수정할 이름을 새롭게 입력받습니다.
		 * 
		 * 만약에 값이 없으면 "이름은 존재하지 않습니다" 를 출력합니다.
		 * 
		 * 문자열의 비교
		 * 문자열.equals(비교할 문자열)
		 */
				
		Scanner scan = new Scanner(System.in);
		
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"};
		boolean flag = false; // 찾으면 true로 변경할 것임
		
		System.out.print("수정할 학생의 별명을 입력>");
		String name = scan.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].equals(name)) { // 이름을 배열과 다 비교하기
				System.out.println(name + "별명을 변경합니다");
				System.out.print(">");
				String name2 = scan.next();			
				arr[i] = name2; // 이름을 변경
				flag = true; // 찾은 경우라면 true로 변경
				break;
			} 
		}
			
			// 찾았다? vs 못 찾았다?
		if(flag) {
				System.out.println(Arrays.toString(arr));
		} else {
				System.out.println("별명이 존재하지 않습니다");
		}			
	}
}


