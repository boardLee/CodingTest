package jk.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 배열 두 배 만들기
 * [https://school.programmers.co.kr/learn/courses/30/lessons/120809]
 */
public class Sol_230314_1 {
    public static int[] solution(int[] numbers) {
        int[] ints = new int[numbers.length];


        return Arrays.stream(numbers).map(number -> number*2).toArray();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(solution(a));

    }
}
