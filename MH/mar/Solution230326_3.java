package mar;

public class Solution230326_3 {
	
	// 프로그래머스 - lv.0 - 양꼬치
	public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        
        service = n / 10;
        
        answer = (n * 12000) + ((k - service) * 2000);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230326_3 s = new Solution230326_3();
		System.out.println(s.solution(64, 6));
	}
}
