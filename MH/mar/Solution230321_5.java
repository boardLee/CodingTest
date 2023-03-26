package mar;

public class Solution230321_5 {
	
	// 프로그래머스 - lv.1 - 나머지가 1이 되는 수 찾기
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
        	if(n % i == 1) {
        		return i;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230321_5 s = new Solution230321_5();
		System.out.println(s.solution(12));
	}
}
