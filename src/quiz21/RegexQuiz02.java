package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		// arr 상품번호, GS25, (상품명), 가격을 정규표현식으로 나눠서 출력
		
		String number = "[0-9]+-?[0-9]+"; // 상품번호
		String gs = "GS2?5?"; // GS25
		String name = "([가-힣]+)"; // 상품명
		String price = "[0-9]+,?[0-9]+"; // 가격
		

		
		for(String i : arr) {
					
			Matcher m1 = Pattern.compile(number).matcher(i);
			Matcher m2 = Pattern.compile(gs).matcher(i);
			Matcher m3 = Pattern.compile(name).matcher(i);
			Matcher m4 = Pattern.compile(price).matcher(i);
			
			while(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.print("상품번호:" + m1.group() + ", 점포:" + m2.group() + ", 상품명:" + m3.group() + ", 가격:" + m4.group());
				System.out.println();
				
			}
			
		}
	}
}
