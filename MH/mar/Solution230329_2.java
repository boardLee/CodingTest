package mar;

public class Solution230329_2 {
	
	// 프로그래머스 - lv.0 -점의 위치 구하기
	public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0]  > 0) {
        	if(dot[1] > 0) return 1;
        	if(dot[1] < 0) return 4;
        } else {
        	if(dot[1] > 0) return 2;
        	if(dot[1] < 0) return 3;
        }
        
        return answer;
    }
}
