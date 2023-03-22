package jk.programmers.day_230322;

public class Sol_3 {
    public int solution(int slice, int n) {
        int answer = 0;
        while (true) {
            if (n <= 0) {
                return answer;
            }
            n -= slice;
            answer++;
        }
    }

    public int solution1(int slice, int n) {
        return n % slice > 0 ? n / slice + 1 : n / slice;
    }

    public static void main(String[] args) {
        Sol_3 s3 = new Sol_3();
        System.out.println(s3.solution(7, 10));
        System.out.println(s3.solution(4, 12));
    }
}
