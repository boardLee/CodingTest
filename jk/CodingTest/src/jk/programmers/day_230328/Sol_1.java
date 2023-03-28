package jk.programmers.day_230328;

public class Sol_1 {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        int a = 0;
        for (int i = 0; i < num; i++) {
            a += i;
        }
        int count = total - a;
        int first = count / num;
        for (int i = 0; i < num; i++) {
            result[i] = first + i;
        }
        return result;
    }

    // 등차수열의 합 공식 응용
    public int[] solution2(int num, int total) {
        int[] answer = new int[num];
        int nSum = num * (num++) / 2;
        int start = (total - nSum) / num;
        for (int i = 0; i < num; i++) {
            answer[i - 1] = i + start;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
