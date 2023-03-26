package mar;

public class Solution230317_1 {
	
	// 프로그래머스 - lv.0 - 아이스 아메리카노
//	https://school.programmers.co.kr/learn/courses/30/lessons/120819
	public int[] solution(int money) {
        int[] answer = new int[2];
        int iceAmericano = 0;
        
        while(money >= 5500) {
        	money -= 5500;
        	        	
        	++iceAmericano;
        }
        
        answer[0] = iceAmericano;
        answer[1] = money;
        
        return answer;
    }
}
