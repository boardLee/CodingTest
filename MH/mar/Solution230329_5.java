package mar;

public class Solution230329_5 {
	public int[] solution(int[] num_list) {
        
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length; i++) {
        	if(num_list[i] % 2 == 0) even++;
        	if(num_list[i] % 2 == 1) odd++;
        }
        int[] answer = {even, odd};
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] ex1 = {1, 2, 3, 4, 5};
		
		Solution230329_5 s = new Solution230329_5();
		
		int[] result = s.solution(ex1);
		
		System.out.println(result[0] + ", " + result[1]);
	}
}
