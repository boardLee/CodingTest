package mar;

public class Solution230322_2 {
	public int solution(int num1, int num2) {
        int answer = Integer.valueOf((int) ((Long.valueOf(num1) / Long.valueOf(num2)) * 1000));
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution230322_2 s = new Solution230322_2();
		System.out.println(s.solution(3, 2));
	}
}
