package mar;

public class Solution230318_3 {
	
	// 프로그래머스 - lv.1 - 자릿수 더하기
	public int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n);
        
        char[] m = num.toCharArray();
        
//        System.out.println("test : " + m.length);
        
        for(int i = 0; i < m.length; i++) {
        	answer += Character.getNumericValue(m[i]);
//        	System.out.println("test" + i + " : " + m[i]);
//        	System.out.println("answer" + i + " : " + answer);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int ex1 = 123; // 6
		int ex2 = 987; // 24
		
		Solution230318_3 s = new Solution230318_3();
		int result = s.solution(ex2);
		
		System.out.println("result : " + result);
	}
}
