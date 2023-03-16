package jk.programmers.day_230316;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스 - 모음 제거
 * https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */
public class Sol1 {
    public String solution(String my_string) {
        String[] a = {"a", "e", "i", "o", "u"};

        List<String> collect = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {
            for (String s : a) {
                if (s.equals(collect.get(i))) {
                    collect.remove(i);
                    i--;
                    continue;

                }
            }

        }
        return collect.stream().collect(Collectors.joining());
    }

    public String solution1(String my_string) {
        String answer = "";
        String[] a = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < a.length; i++) {
            if (my_string.contains(a[i])) {
                answer = my_string.replaceAll(a[i], "");
                my_string = answer;
            } else {
                answer = my_string;
            }

        }
        return answer;
    }

    public String solution2(String my_String) {
        return my_String.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        //System.out.println(sol1.solution("bus"));
        System.out.println(sol1.solution("nice to meet you"));
    }

}
