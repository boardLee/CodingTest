package mar;

public class Solution230322_2 {
	// 프로그래머스 - lv.0 - 두 수의 나눗셈
	public int solution(int num1, int num2) {
        int answer = (int) ((Double.valueOf(num1) / Double.valueOf(num2)) * 1000);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230322_2 s = new Solution230322_2();
		System.out.println(s.solution(7, 3));
	}
}
