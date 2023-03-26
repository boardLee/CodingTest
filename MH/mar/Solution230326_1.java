package mar;

// 프로그래머스 - lv.0 - 짝수의 합
public class Solution230326_1 {
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 0) answer += i;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230326_1 s = new Solution230326_1();
		
		System.out.println(s.solution(4));
	}
}
