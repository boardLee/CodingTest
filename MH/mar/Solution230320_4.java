package mar;

public class Solution230320_4 {
	
	// 프로그래머스 - lv.1 - 자연수 뒤집어 배열로 만들기
	
	public int[] solution(long n) {
        String num = String.valueOf(n);
        
        StringBuffer sb = new StringBuffer(num);
        num = sb.reverse().toString();
        
        int[] answer = new int[num.length()];
        
        for(int i = 0; i < num.length(); i++) {
        	answer[i] = Integer.valueOf(num.substring(i, i + 1));
        	
        	if(i == (num.length() - 1)) {
        		answer[i] = Integer.valueOf(num.substring(i));
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230320_4 s = new Solution230320_4();
		
		int[] result = s.solution(12345);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(i + " : " + result[i]);
		}
	}
}
