package mar;

public class Solution230331_2 {
	public int solution(int[] common) {
        int answer = 0;
        int t1 = common[1] - common[0];
        int t2 = common[2] - common[1];
        
        if(t1 == t2) {
        	// 등차수열인 경우
        	answer = common[common.length - 1] + t1;
        } else {
        	// 등비수열인 경우
        	answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] ex1 = {3, 6, 9};
		Solution230331_2 s = new Solution230331_2();
		System.out.println(s.solution(ex1));
	}
}
