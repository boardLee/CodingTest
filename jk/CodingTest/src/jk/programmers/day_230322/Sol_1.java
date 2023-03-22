package jk.programmers.day_230322;

public class Sol_1 {
    public int solution(int num, int k) {
        String[] split = String.valueOf(num).split("");
        String s1 = String.valueOf(k);
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(s1)) {
                return i + 1;
            }
        }
        return -1;
    }

    public int solution1(int num, int k) {
        // 문자열을 추가하여 인덱스 1개 추가
        return ("-" + num).indexOf(String.valueOf(k));
    }
    public static void main(String[] args) {
        Sol_1 s1 = new Sol_1();
        System.out.println(s1.solution(29183, 1));
        System.out.println(s1.solution(232443, 4));
        System.out.println(s1.solution(123456, 7));

    }

}
