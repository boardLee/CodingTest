package mar;

public class Solution230324_1 {
	
//	https://school.programmers.co.kr/learn/courses/30/lessons/120822
	// 프로그래머스 - lv.0 - 문자열 뒤집기
	public String solution(String my_string) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer(my_string);
        answer = String.valueOf(sb.reverse());
        
        
        return answer;
    }
}
