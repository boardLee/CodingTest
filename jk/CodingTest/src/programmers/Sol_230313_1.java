package programmers;

/*
*  프로그래머스 - 분수의 덧셈
* [https://school.programmers.co.kr/learn/courses/30/lessons/120808]
*/

public class Sol_230313_1 {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom2 * denom1;

        int divisor = gcd(top, bottom);

        answer[0] = top / divisor;
        answer[1] = bottom / divisor;

        return answer;
    }

    public int gcd(int a, int b) {
        if (a%b == 0) {
            return b;
        }
        return gcd(b, (a%b));
    }


    public static void main(String[] args) {
        Sol_230313_1 s1 = new Sol_230313_1();
        int[] solution = s1.solution(1,2,3,4);
        System.out.println("[" + solution[0] + ", " + solution[1] +"]");
    }


}
