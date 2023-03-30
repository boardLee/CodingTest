package jk.programmers.day_230330;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sol_2 {
    public String solution(String my_string) {

        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Sol_2 s2 = new Sol_2();
        System.out.println(s2.solution("people"));
        System.out.println(s2.solution("We are the world"));
    }
}
