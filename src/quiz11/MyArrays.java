package quiz11;

public class MyArrays {
	
	private MyArrays() {} // 외부에서 객체 생성 불가
	
	
	// 문자열의 합
	// [ + 배열요소 + , + 배열요소...... + ]
	
	
	public static String toString(int[] arr) {
		
		String result = "[";
		
		for(int i = 0; i < arr.length; i++) {
		
			result += arr[i];
			 
			if(i < arr.length - 1) {
			
			result += ", ";
			
			}
			
		}
		
		return result + "]";
	}
	
	public static String toString(String[] arr) {
		
		String result = "[";
		
		for(int i = 0; i < arr.length; i++) {
		
			result += arr[i];
			 
			if(i < arr.length - 1) {
			
			result += ", ";
			
			}
			
		}
		
		return result + "]";
	}
	
	public static String toString(char[] arr) {
		
		String result = "[";
		
		for(int i = 0; i < arr.length; i++) {
		
			result += arr[i];
			 
			if(i < arr.length - 1) {
			
			result += ", ";
			
			}
			
		}
		
		return result + "]";
	}


	
	/*
	 * Arrays.toString() 메서드 내가 만들기
	 * 
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 됩니다
	 * 	  -> 생성자에 접근제어자를 이용해서 객체생성을 하지 못하도록
	 * 
	 * 2. 메서드 호출 시에는 static 키워드를 이용해서 사용하도록 만들어준다
	 * 
	 * 3. int[]이나 String[]이나 Char[]이 전달되더라도 동일하게 동작하도록 메서드 오버로딩
	 */

}
