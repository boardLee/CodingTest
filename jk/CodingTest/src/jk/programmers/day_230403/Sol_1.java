package jk.programmers.day_230403;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sol_1 {
    public int[] solution(int[] numbers, String direction) {
        int temp = 0;
        int[] answer = new int[numbers.length];

        if (direction.equals("left")) {
            temp = numbers[0];
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = temp;
        } else if (direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];

            for (int i = 0; i < numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
        }
        return answer;
    }
    public int[] solution1(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 455, 6, 4, -1, 45, 6};
        Sol_1 s1 = new Sol_1();
        System.out.println(Arrays.toString(s1.solution(a, "right")));
        System.out.println(Arrays.toString(s1.solution(b, "left")));

    }

}
