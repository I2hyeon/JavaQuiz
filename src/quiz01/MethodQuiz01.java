package quiz01;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		System.out.println(method3(1, 2, 3.4));
		System.out.println(method4(5));
		method5("홍길동", 2);
		System.out.println(maxNum(3,6));
		System.out.println(abs(-3));
		
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	
	static String method4(int a) {
		String str;
		if(a%2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		return str;
	}
	
	  /* 다른 풀이 // 바로 출력하는 것
	   * if(a % 2 == 0) {
	   * 	return "짝수";
	   * } else {
	   * 	return "홀수";
	   * */

	static void method5(String a, int b) { // 반환이 없으므로 void 사용
		for(int i = 1; i <= b; i++) {
			System.out.println(a);
		}
	}
	
	static int maxNum(int a, int b) {
		int max = b;
		if(a >= b) {
			a = max;
		}		
		return max;
	}
	
	/* 다른 풀이
	 * return a > b ? a : b; // 3항 연산식 사용~!
	 */
	
	static int abs(int a) {
		int num = a;
		if(a < 0) {
			a = -a; 
			num = a;
		}
		return num;
	}
	
	/* 다른 풀이
	 * return a < 0 ? -a : a; // 3항 연산식
	 */
	
}
