package quiz01;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. java() - 문자열의 합
		 * 매개변수로 정수를 받습니다
		 * 매개변수 1 -> return "자";
		 * 매개변수 2 -> return "자바";
		 * 매개변수 3 -> return "자바자"
		 * 매개변수 4 -> return "자바자바";
		 * 
		 * 2. sum()
		 * 매개변수로 정수를 1개 받습니다.
		 * 매개변수의 약수의 합계를 리턴
		 * 매개변수 5 -> return 1 + 5 = 6 
		 * 매개변수 6 -> return 1 + 2 + 3 + 6
		 * 
		 * 3. primeNum() 
		 * 매개변수 2개를 받아서 순서 상관없이 두 수 사이의 합계를 리턴
		 * 1, 2 -> return 1 + 2;
		 * 2, 1 -> return 1 + 2;
		 * 1, 1 -> return 0;
		 */
		
		System.out.println(java(7));
		System.out.println(sum(10));
		System.out.println(primeNum(1, 4));
		
	}
	
	static String java(int a) {
		String c = "";
		if(a % 2 == 0) {
			for(int i = 1; i <= a/2; i++) {
				c += "자바";
		}} else {
			for(int i = 1; i <= a/2; i++) {
				c += "자바";
		}}
		return a % 2 == 0? c : c + "자";
	}
	
	/* 다른 풀이
	 * static string java(int a) {
	 * 		String str = "";
	 * 
	 * 		for(int i = 1; i <= a; i++) {
	 * 			// 홀수일 때 자, 짝수일 때 바
	 * 			if(i % 2 == 0) {
	 * 				str += "바";
	 * 			} else {
	 * 				stt += "자";
	 * 			}
	 * 
	 * 			return str;
	 * }
	 */
		
	
	static int sum(int a) {
		int c = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) { // i는 약수
				c += i;
			}
		}
		
		return c;
	}
	
	static int primeNum(int a, int b) {
		int sum = 0;
		if(a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		} else if (b > a) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}	
		}
		return sum;
	}
	 
	/* 또 다른 풀이
	 * 
	 * if(a == b) return 0;
	 * 
	 * int max = a > b ? a : b;
	 * int min = a > b ? b : a;
	 * 
	 * int sum = 0;
	 * for(int i = min; i <= max; i++) {
	 * 		sum += i;
	 * }
	 * return sum;
	 */

	

}