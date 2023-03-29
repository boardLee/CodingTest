package mar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution230329_4 {
	
	// 프로그래머스 - lv.0 - 최댓값 만들기(1)
	public int solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
        	arr.add(numbers[i]);
        }

        Collections.sort(arr);
        int answer = arr.get(numbers.length - 1) * arr.get(numbers.length - 2);
        
        return answer;
    }
	
	// 다른사람 풀이
	public int solution2(int[] numbers) {
		Arrays.sort(numbers);
		
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
	}
	
	public static void main(String[] args) {
		int[] ex1 = {1, 2, 3, 4, 5};
		int[] ex2 = {0, 31, 24, 10, 1, 9};
		Solution230329_4 s = new Solution230329_4();
		System.out.println(s.solution(ex2));
	}
}
