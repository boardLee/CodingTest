package jk.programmers;

/**
 * 프로그래머스 - 피자 나눠먹기(1)
 * [https://school.programmers.co.kr/learn/courses/30/lessons/120814]
 */

public class Sol_230314 {
    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : (n / 7) + 1;
    }

    public static void main(String[] args) {
        Sol_230314 s2 = new Sol_230314();
        System.out.println(s2.solution(7));
        System.out.println(s2.solution(1));
        System.out.println(s2.solution(15));
    }
}
