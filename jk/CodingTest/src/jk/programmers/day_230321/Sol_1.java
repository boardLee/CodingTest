package jk.programmers.day_230321;

public class Sol_1 {
    public String solution(String bin1, String bin2) {
        int i = Integer.parseInt(bin1, 2);
        int i2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(i + i2);
    }

    public static void main(String[] args) {
        Sol_1 s1 = new Sol_1();

        System.out.println(s1.solution("10", "11"));
        System.out.println(s1.solution("1001", "1111"));


    }
}
