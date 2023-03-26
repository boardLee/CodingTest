package mar;

public class Solution230320_1 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/120810
	// 프로그래머스 - lv.0 - 나머지 구하기
	public int solution(int num1, int num2) {
        int answer = num1 % num2;
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		
		Solution230320_1 s = new Solution230320_1();
		
		System.out.println(s.solution(n1, n2));
	}
}
