package quiz01;

import java.util.Scanner;

public class Quiz20 {

		public static void main(String[] args) {
		
			
			/*
			 * 가로, 세로를 입력받아서 사각형을 출력합니다.
			 * 단, 윤곽만 출력합니다.
			 */
			
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt(); // 가로
			int b = scan.nextInt(); // 세로
			
			for(int i = 1; i <= b; i++) { // 세로
					
				for (int j = 1; j <= a; j++) { // 가로					
					if(i == 1 || i == b) { //첫, 마지막 행
						System.out.println("*");
					} else { // 나머지 행
						if(j == 1 || j == a) {
							System.out.println("*");
						}
						System.out.println(" ");
					}
				
				}
				
				
//					if (i == 1 || i == b || j == 1 || j == a) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//				}}
				
				

				System.out.println();
			}			
		}
}
