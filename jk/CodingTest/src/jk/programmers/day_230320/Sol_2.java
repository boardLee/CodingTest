package jk.programmers.day_230320;

import java.util.Arrays;

public class Sol_2 {
    public int solution(int[] array, int n) {
        return (int)Arrays.stream(array).filter(i -> i == n).count();
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 5};
        int[] b = {0, 2, 3, 4};
        Sol_2 s2 = new Sol_2();
        System.out.println(s2.solution(a, 1));
        System.out.println(s2.solution(b, 1));
    }
}
