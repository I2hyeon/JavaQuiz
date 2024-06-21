package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz29 {
	
	public static void main(String[] args) {
		
		// 백준 2차원 배열 - 2566번
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}			
		}
		
		int max = arr[0][0];
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(max <= arr[i][j]) {
					max = arr[i][j];
					a = i+1; // 행, 열은 1부터 시작
					b = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(a + " " + b);
		
	}

}
