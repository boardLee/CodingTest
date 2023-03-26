package mar;

public class Solution230318_2 {
	
	// 프로그래머스 - lv.1 - 평균 구하기
	public double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        return answer/arr.length;
    }
	
	public static void main(String[] args) {
		int[] ex1 = {1, 2, 3, 4};
		int[] ex2 = {5, 5};
		
		Solution230318_2 s = new Solution230318_2(); 
		double result = s.solution(ex2);
		
		System.out.println(result);
	}
}
