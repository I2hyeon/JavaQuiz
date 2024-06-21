package quiz01;

import java.math.BigInteger;

// HastSet 중복 X 자동정렬 O
// Collections.sort(list, Collections.reverseOrder());

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    
    public int solution(int[] sides) {
    	
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int i = 1;
        
        while( i < max ) { // sides 원소의 길이가 가장 길 경우
        	if( max < i + min) {
        		answer++; i++;
        	} 	
        }
        
        
        
        return answer;
    }

    	

    public static void main(String[] args) {
		
    	Solution s = new Solution();
    	
    	int[] arr = {1, 2, 3, 4, 5, 6};
    	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	String[] arr3 = {"l"};
    	
    	
//    	System.out.println(Arrays.toString(s.solution(arr)));
    	System.out.println(s.solution(3, 2));
	}
}
	
