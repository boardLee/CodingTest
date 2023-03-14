package jk.programmers;

import java.util.stream.Collectors;

/*
* 프그래머스 - Level 0 - 외계행성의 나이
* 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
* 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
* a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
* 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
*/
public class Sol_230313 {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String s = String.valueOf(age);

        for (int i = 0; i < s.length() ;i++) {
            char c = s.charAt(i);
            c = (char)(c + 49);
            String s1 = String.valueOf(c);
            answer.append(s1);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Sol_230313 a = new Sol_230313();

        System.out.println(a.solution(10));

        System.out.println(a.streamSolution(233));
        System.out.println(a.arraySolution(234));

    }

    public String streamSolution(int age) {
        return String.valueOf(age).chars().mapToObj(op -> String.valueOf((char) (op + 49))).collect(Collectors.joining());
    }

    public String arraySolution(int age) {
        String answer = "";
        // 숫자와 알파벳 매칭
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        while (age > 0) {
            answer = alpha[age % 10] + answer;
            age /= 10;
        }
        return answer;
    }
}
