package mar;

public class Solution230330_1 {
	public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
        	babbling[i] = babbling[i].replaceAll("aya", "z")
        			.replaceAll("ye", "z")
        			.replaceAll("woo", "z")
        			.replaceAll("ma", "z")
        			.replaceAll("z", "");
        	
        	System.out.println(babbling[i].toString());
        	
        	if("".equals(babbling[i])) {
        		answer += 1;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] ex1 = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] ex2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		Solution230330_1 s = new Solution230330_1();
		System.out.println(s.solution(ex2));
	}
}
