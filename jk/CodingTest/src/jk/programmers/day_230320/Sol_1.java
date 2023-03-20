package jk.programmers.day_230320;

import java.util.Arrays;

public class Sol_1 {
    public String solution(String[] seoul) {

        StringBuffer sb = new StringBuffer();
        sb.append("김서방은 ");

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                sb.append(i);
                break;
            }

        }
        sb.append("에 있다");
        String s = sb.toString();
        return s;
    }

    public String solution1(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }

    public static void main(String[] args) {

        Sol_1 s1 = new Sol_1();
        String[] a = {"Jane", "Kim"};

        System.out.println(s1.solution(a));
    }

}
