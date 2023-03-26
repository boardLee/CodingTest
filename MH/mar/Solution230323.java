package mar;

public class Solution230323 {
//	프로그래머스 - lv.1 - 정수 제곱근 판별
	public long solution(long n) {
        long answer = -1;
        
        for(long i = 0; i * i <= n; i++) {
        	if((i * i) == n) return (i + 1) * (i + 1);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230323 s = new Solution230323();
		System.out.println(s.solution(3));
	}
}
