package quiz15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. main에서 scanner를 사용해서 2개의 정수값 입력받음
		 * 2. divide(정수 2개)를 입력받는 메서드에 전달을 해주세요
		 * 	  -> 
		 * 3. divide 메서드에서는 b가 0인 경우 예외를 강제 생성해서 종료하는 구문을 작성해보세요
		 * 4. main에서 입력받을 때는, 문자인 경우 예외처리를 진행하고 다시 입력 받으세요
		 * 
		 * 예외종류
		 * InputMismatchExcepion
		 * ArithmeticException
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				
				System.out.print("정수1>");
				int a = sc.nextInt();
				System.out.print("정수2>");
				int b = sc.nextInt();
				System.out.println("정답" + divide(a, b));
				break;
				
			} catch (InputMismatchException e) {
				
				System.out.println("숫자를 입력해주세요");
				sc.nextLine();
				
			} catch (ArithmeticException e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("프로그램 정상종료");
		
	}
		
	
	public static int divide(int a, int b) throws ArithmeticException {
		
		if(b == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다");
		}
		
		return (a / b);
		
	}

}
