package apr2023;

public class Solution230401_1 {
	
	// 프로그래머스 - lv.0 - 종이 자르기
	public int solution(int M, int N) {
        
        return (M - 1) + (M * (N - 1));
    }
	
	public static void main(String[] args) {
		Solution230401_1 s = new Solution230401_1();
		System.out.println(s.solution(2, 5));
	}
}
