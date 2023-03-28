package jk.programmers.day_230328;

public class Sol_2 {
    public String solution(String my_string) {

        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }

    public String solution2(String my_string) {
        return new StringBuffer(my_string).reverse().toString();
    }
    public static void main(String[] args) {
        Sol_2 s2 = new Sol_2();

        System.out.println(s2.solution("jaron"));
        System.out.println(s2.solution("bread"));

    }
}
