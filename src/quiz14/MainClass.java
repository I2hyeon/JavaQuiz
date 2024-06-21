package quiz14;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/* main을 실행시키면, 프로그램 종료전까지 사용자에게 입력을 받을 수 있습니다.
		 * 인터페이스형으로 선언하고 무한반복문 안에서,
		 * 메뉴를 입력받아서 
		 * 음악을 추가하는 기능, 재생기능, 종료기능 
		 * 
		 * 을 실행해주세요
		 */
		
		Scanner scan = new Scanner(System.in);

		// 객체 선언
		SongList song = new MelonMusic();
				
		while(true) {
			System.out.println("메뉴: 1.추가 2.재생 3.종료");
			System.out.print(">");
			String menu = scan.next();
			
			
			if(menu.equals("1")) {
				System.out.print("추가할 음악>");
				String music = scan.next();
				song.insertList(music);
				
				
				
			} else if(menu.equals("2")) {
				System.out.print("재생>");
				song.playList();
				
				
			} else if(menu.equals("3")) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
	}
}
