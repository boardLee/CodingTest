package mar;

public class Solution230331_1 {
	public int[] solution(int num, int total) {
        int[] answer = new int [num];
        int n = 0;
        int sum = 0;
        
        for(int i = 0; i < num; i++) {
        	sum += i;
        }
        
        n = (total - sum) / num;
        
        for(int i = 0; i < num; i++) {
        	answer[i] = n + i;
        }
        
        return answer;
    }
}
