package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	
	public static void main(String[] args) {
		
		// 간단한 회원정보 관리 프로그램
		// 클래스와 인터페이스를 활용해서 분리
		
		Scanner sc = new Scanner(System.in);
		
		// 유저를 관리할 클래스
		IUserManagement manage = new UserManagement();
		
		while(true) {
			
			System.out.println("-----------------------------------------------------");
			System.out.println("[1.회원 등록 2.회원 전체보기 3.회원 정보 검색 4.회원 정보 삭제 5.프로그램 종료]");
			System.out.print("메뉴 > ");
			
			int menu = sc.nextInt();
			
			// 메뉴에 따라서 기능을 나눔
			
			if(menu == 1) {
				
				// 스캐너로 이름, 나이를 입력받아서 User객체에 저장하고 리스트에 하나 추가
				
				System.out.println("회원 정보를 기입해주세요");
				System.out.print("이름:");
				String name = sc.next();
				System.out.print("나이:");
				int age = sc.nextInt();
				
				// 메서드 호출
				manage.insert(name, age);

				System.out.println(name + "님을 회원으로 등록하였습니다");
				
			} else if(menu == 2) {
				
				// list 안에 저장된 모든 회원정보를 반복문으로 출력
				
				manage.printList();
				
			} else if(menu == 3) {
				
				// 찾을 이름을 입력받아서 이름이 있다면 이름과 나이를 출력합니다
				// 단 찾는 이름이 없으면 "~님은 없습니다" 출력합니다
				
				System.out.print("찾고 싶은 회원의 이름을 입력해주세요 > ");
				String name = sc.next();
				
				manage.search(name);
				
			} else if(menu == 4) {
				
				// 삭제할 이름을 입력받아서 동일한 User 객체를 삭제
				// 단 첫번째로 발견되는 User만 삭제
				
				System.out.print("삭제하고 싶은 회원의 이름을 입력해주세요 > ");
				String name = sc.next();
				
				manage.delete(name);
				
			} else if(menu == 5) {
				
				// 프로그램 종료
				System.out.println("프로그램을 종료하겠습니다");
				System.exit(0);
			}
		}
		
	}

}
