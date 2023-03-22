package jk.programmers.day_230322;

public class Sol_2 {
    public int solution(int n) {
        int a = 1;
        while (true) {
            if ((6 * a) % n == 0) {
                return a;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        Sol_2 s1 = new Sol_2();
        System.out.println(s1.solution(6));
        System.out.println(s1.solution(10));
        System.out.println(s1.solution(4));
    }
}
