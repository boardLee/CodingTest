public class Solution230320_3 {
	// 프로그래머스 - lv.1 - x만큼 간격이 있는 n개의 숫자
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
        	answer[i] = x + (x * i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230320_3 s = new Solution230320_3();
		long[] result = s.solution(-4, 2);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(i + " : " + result[i]);
		}
	}
}
