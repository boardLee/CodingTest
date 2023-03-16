package jk.programmers.day_230315;

import java.util.*;

/**
 * 최빈값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 */
public class Sol2 {
    public int solution(int[] array) {
        HashMap<Integer, Integer> value = new HashMap<>();
        for (int i : array) {
            if (value.containsKey(i)) {
                value.put(i, value.get(i) + 1);
            } else {
                value.put(i, 1);
            }
        }
        if (value.size() != 1) {
            int[] ints = value.values().stream().mapToInt(x -> x).sorted().toArray();
            if (ints[ints.length-1] == ints[ints.length - 2]) {
                return -1;
            }
            return value.values().stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
        }
        return value.get(array[0]);
    }

    public int solution1(int[] array) {

        Map<Integer, Integer> value = new HashMap<>();
        for (int i : array) {
            if (value.containsKey(i)) {
                value.put(i, value.get(i) + 1);
            } else {
                value.put(i, 1);
            }
        }

        int maxVal = value.values().stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
        System.out.println("test" + maxVal);

        int temp = -1;
        for (Integer i : value.keySet()) {
            if (value.get(i) == maxVal && temp == -1) {
                temp = maxVal;
                continue;
            }
            if (value.get(i) == temp) {
                return -1;
            }
        }
        return temp;
    }

    public int Solution2(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol2 sol2 = new Sol2();
        int[] a = {1, 2, 3, 3, 3, 4};
        int[] b = {1, 1, 2, 2};
        int[] c = {1};
        System.out.println(sol2.solution1(a));
        System.out.println(sol2.solution1(b));
        System.out.println(sol2.solution1(c));
    }
}
