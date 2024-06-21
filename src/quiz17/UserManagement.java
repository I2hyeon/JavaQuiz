package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagement implements IUserManagement {
	
	// 값을 저장할 리스트
	private List<UserVO> list = new ArrayList<>();
	
	// 메서드
	
	// 회원정보 추가
	public void insert(String name, int age) {
		
		list.add(new UserVO(name, age));
	}
	
	// 회원정보 출력
	public void printList() {
		
		System.out.println("회원 정보를 출력합니다");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("이름:" + list.get(i).getName() + ", 나이:" + list.get(i).getAge());
		
		}
	
	}
	
	// 회원정보 검색
	public boolean search(String name) {
		
		boolean flag = false;

		
		for(UserVO i : list) {
			if(i.getName().equals(name)) { // 입력받은 회원 이름 일치여부 확인
				System.out.println("이름:" + i.getName() + ", 나이:" + i.getAge());
				flag = true; // if문을 실행했음
				break;
			}
	
		}	
		
		return flag;
	}
		
	// 회원정보 삭제
 	public boolean delete(String name) {
 		
 		boolean flag = false;
 		
 		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println(list.get(i).getName()+ "님을 삭제하겠습니다");
				list.remove(i);  flag = true; break;
			}
 		}
 		
 		return flag;
 		
 	
 	}
 	
}
