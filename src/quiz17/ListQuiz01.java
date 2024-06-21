package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	
	public static void main(String[] args) {
		
		/* 
		 * 1. 숫자를 저장하는 리스트를 만들고, 1 ~ 20까지 값을 순서대로 저장
		 * 2. UserVO를 저장할 수 있는 리스트를 만들고 User 객체 3개를 저장
		 * 3. 2번에 저장된 List 안에 이름과 나이를 반복문으로 전부 출력
		 * 4. 2번에 저장된 List 안에 "홍길동"이 있다면 홍길동 객체의 이름과 나이를 출력
		 * 5. 2번에 저장된 List 안에 "홍길동"이 있다면 홍길동 객체를 삭제
		 */
		
		// 1
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		System.out.println(list.toString());
		
		// 2
		List<UserVO> list2 = new ArrayList<>();
		
//		UserVO u1 = new UserVO("홍길동", 20);
//		UserVO u2 = new UserVO("유관순", 21);
//		UserVO u3 = new UserVO("이순신", 22);

		list2.add(new UserVO("홍길동", 20));
		list2.add(new UserVO("유관순", 21));
		list2.add(new UserVO("이순신", 22));
		
		// 3
		for(int i = 0; i < list2.size(); i++) {
			System.out.println("이름:" + list2.get(i).getName() + ", 나이:" + list2.get(i).getAge());
		}
		
		// 4
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길동")) {
				System.out.println("홍길동이 존재합니다!");
				System.out.println("이름:" + list2.get(i).getName() + ", 나이:" + list2.get(i).getAge());
			}
		}
		
		// 5
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길동")) {
				list2.remove(i); // i번째 삭제
				break;
			}
		}
		
		
	}

}
