package jk.programmers.day_230323;

public class Sol_1 {
    public int solution(String A, String B) {
        int answer = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return answer;
            }
            String a = A.substring(A.length() - 1);
            A = a + A.substring(0, A.length() - 1);
            answer++;
        }
        return -1;
    }

    public int solution1(String A, String B) {
        String tempB = B.repeat(3);
        return tempB.indexOf(A);

    }

    public static void main(String[] args) {
        Sol_1 s1 = new Sol_1();
        System.out.println(s1.solution("hello", "ohell"));

    }
}
