package jk.programmers.day_230329;

import java.util.stream.IntStream;

public class Sol_1 {
    public int solution(int n) {
        double a = Math.sqrt(n);
        int result = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = n; j >= a; j--) {
                if (i*j == n) {
                    result++;
                    break;
                }
            }
        }
        if (a == 1) {
            return 1;
        }
        if (a%10==0) {
            return result * 2 - 1;
        }
        return result*2;
    }

    public int solution1(int n){
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    public static void main(String[] args) {
        Sol_1 s1 = new Sol_1();
        System.out.println(s1.solution(20));
        System.out.println(s1.solution(100));


    }
}
