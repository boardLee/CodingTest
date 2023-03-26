package mar;

public class Solution230326_4 {
	boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
        	if(i < s.length()) {
        		if("p".equals(s.substring(i, i + 1))) cnt++;
        		if("y".equals(s.substring(i, i + 1))) cnt--;
        	}
        }
        
        if(cnt == 0) {
        	answer = true;
        }
        
        return answer;
    }
	
	boolean solution2(String s) {
		s = s.toLowerCase();
		
		// 이 방법은 속도가 느리다고 함
		return s.chars().filter(e -> 'p' == e).count() == s.chars().filter(e -> 'y' == e).count();
	}
	
	
	public static void main(String[] args) {
		Solution230326_4 s = new Solution230326_4();
		System.out.println(s.solution("pPoooyY"));
	}
}
