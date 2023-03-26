package mar;

import java.util.Arrays;

public class Solution230326_2 {
	
	// 프로그래머스 - lv.0 - 배열의 평균값
	public double solution(int[] numbers) {
        double answer = 0;
        
        for(int i = 0; i < numbers.length; i++) {
        	answer += numbers[i];
        }
        
        answer /= numbers.length;
        
        return answer;
    }
	
	public double solution2(int[] numbers) {
		
		// 다른 사람의 풀이
		return Arrays.stream(numbers).average().orElse(0);
	}
	
	public static void main(String[] args) {
		int[] ex = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Solution230326_2 s = new Solution230326_2();
		
		System.out.println(s.solution(ex));
	}
}
