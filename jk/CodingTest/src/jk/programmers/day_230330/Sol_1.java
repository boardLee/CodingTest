package jk.programmers.day_230330;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sol_1 {
    public String solution(String my_string, int num1, int num2) {
        String[] word = my_string.split("");
        String temp = word[num1];
        word[num1] = word[num2];
        word[num2] = temp;
        return Arrays.stream(word).collect(Collectors.joining());
    }

    // Collections 함수의 swap
    public String solution1(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }

    public static void main(String[] args) {
        Sol_1 s1 = new Sol_1();
        System.out.println(s1.solution("hello", 1, 2));
        System.out.println(s1.solution("i love you", 3, 6));

    }
}
