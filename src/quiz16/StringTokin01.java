package quiz16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokin01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 * 5. 분리된 문자열을 배열에 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("분리된 토큰의 개수: " + st.countTokens());
		
		String[] arr = new String[st.countTokens()];
		int i = 1;
		while(st.hasMoreTokens()) {
			arr[i-1] = st.nextToken(); // 전진은 한 번만
			System.out.println(i + ". " + arr[i-1]);
			i++;
		}
		
		/*
		 * for(int i = 0; token.hasMorTokens(); i++) {
		 * 		String word = token.nextToken();
		 * 		System.out.println( (i+1) + ". " + word );
		 * 		arr[i] = word;
		 * }
		 */
		
		System.out.println(Arrays.toString(arr));
		
		
			
	}

}
