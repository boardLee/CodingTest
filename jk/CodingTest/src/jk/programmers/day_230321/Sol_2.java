package jk.programmers.day_230321;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Sol_2 {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                a.add(i);
            }
        }
        return a.stream().mapToInt(Integer::new).toArray();
    }

    public int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 1).toArray();
    }

    public static void main(String[] args) {
        Sol_2 sol_2 = new Sol_2();


        System.out.println(Arrays.toString(sol_2.solution(10)));
        System.out.println(Arrays.toString(sol_2.solution(15)));

    }
}
