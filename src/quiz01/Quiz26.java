package quiz01;

import java.util.Scanner;

public class Quiz26 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 바구니 개수
		int m = scan.nextInt(); // 변경할 횟수
		
		int[] arr = new int[n];
		
		int t = 0;
		while(t < arr.length) { // 바구니의 공 번호 맞춰주기
			arr[t] = t + 1;
			t++;
		}
		
		/*
		 *  for문 
		 *  for(int i = 1; t < arr.length; i++) {arr[i] = i + 1;}
		 */
		
		for(int q = 1; q <= m; q++) { // 상자=배열값 맞춰서 공을 m번 교환하기
			
			int i = scan.nextInt() - 1;
			int j = scan.nextInt() - 1;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		/*
		 *  while문
		 *  int i = 0; 
		 *  	while(i <= m) {
		 *  	int i = scan.nextInt();
		 *		int j = scan.nextInt();
		 *  자리 바꾸기
		 *  int temp = arr[i - 1];
		 *  arr[i - 1] = arr[j - 1];
		 *  arr[j - 1] = temp;
		 *  i++;
		 */
		
	
	   for(int r = 0; r < arr.length; r++) {
		   System.out.print(arr[r] + " ");
	   }
		
	}

}
