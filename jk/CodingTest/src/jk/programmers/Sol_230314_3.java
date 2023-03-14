package jk.programmers;

import java.util.Arrays;

public class Sol_230314_3 {
    public static int solution(int[] array) {
        int[] ints = Arrays.stream(array).sorted().toArray();
        return ints[(ints.length)/2];
    }

    public static int solution1(int[] array) {
        int[] ints = Arrays.stream(array).sorted().toArray();
        // 시프트 연산
        return ints[(ints.length >> 1)];
    }
    public static void main(String[] args) {
        int[] a = {9,-1,0};
        System.out.println(solution(a));
    }
}
