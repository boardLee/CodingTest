package jk.programmers.day_230315;

/**
 * 합성수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */
public class Sol1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 3; i <= n; i++) {
            if (sol(i)) {
                answer++;
            }
        }
        return answer;
    }

    boolean sol(int n) {
        // 1과 본인을 제외하고 나누었을 때 나머지가 없을 경우 합성수 이다.
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Sol1 sol1 = new Sol1();
        System.out.println(sol1.solution(15));
    }
}
