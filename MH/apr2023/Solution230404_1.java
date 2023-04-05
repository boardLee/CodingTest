package apr2023;

public class Solution230404_1 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/120894
	// 프로그래머스 - lv.0 - 영어가 싫어요
	public long solution(String numbers) {
        long answer = 0;
        
        answer = Long.valueOf(numbers.replaceAll("one", "1")
        							.replaceAll("two", "2")
        							.replaceAll("three", "3")
        							.replaceAll("four", "4")
        							.replaceAll("five", "5")
        							.replaceAll("six", "6")
        							.replaceAll("seven", "7")
        							.replaceAll("eight", "8")
        							.replaceAll("nine", "9")
        							.replaceAll("zero", "0"));
        
        return answer;
    }
}
