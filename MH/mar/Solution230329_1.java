package mar;

public class Solution230329_1 {
	
	// // 프로그래머스 - lv.0 - 피자 나눠 먹기(1)
	public int solution(int n) {
        int answer = (n % 7) == 0 ? (n / 7) : (n / 7) + 1;
        
        return answer;
    }
}
