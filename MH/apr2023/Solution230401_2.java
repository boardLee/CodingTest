package apr2023;


public class Solution230401_2 {
	public String[] solution(String my_str, int n) {
		
		int num = my_str.length() % n == 0 ? my_str.length() / n : (my_str.length() / n) + 1;
        String[] answer = new String[num];
        
		for(int i = 0; i < num; i++) {
			if(my_str.length() <= n) {
				answer[i] = my_str;
			} else {
				answer[i] = my_str.substring(0, n);
				my_str = my_str.substring(n);
			}
			
			System.out.println(i + "번째: " + answer[i].toString());
			System.out.println("my_str : " + my_str);
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		String str = "abc1Addfggg4556b";
		int n = 6;
		
		Solution230401_2 s = new Solution230401_2();
		String[] ex = s.solution(str, n);
		
		for(int i = 0; i < ex.length; i++) {
			System.out.println(ex[i]);
		}
		
	}
}
