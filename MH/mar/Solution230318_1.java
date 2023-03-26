package mar;

public class Solution230318_1 {
	
	// 프로그래머스 - lv.1 - 약수의 합
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(i * i == n) {
        		answer += i;
        	} else if(n % i == 0) {
        		answer += i;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int ex1 = 12;
		int ex2 = 5;
		
		Solution230318_1 s = new Solution230318_1();
		
		System.out.println(s.solution(ex2));
	}
}
