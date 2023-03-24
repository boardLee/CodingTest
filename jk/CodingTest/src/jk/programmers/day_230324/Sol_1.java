package jk.programmers.day_230324;

public class Sol_1 {
    public int solution(int[][] dots) {
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < 4; i++) {
            if ((dots[0][0] != dots[i][0]) && dots[0][1] != dots[i][1]) {
                x1 = dots[i][0];
                y1 = dots[i][1];
                break;
            }
        }
        int x = (int) Math.sqrt((int) (Math.pow(dots[0][0] - x1, 2)));
        int y = (int) Math.sqrt((int) (Math.pow(dots[0][1] - y1, 2)));
        return x * y;

    }

    public static void main(String[] args) {
        Sol_1 s1 = new Sol_1();
        int[][] b = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] c = {{-1,-1}, {1, 1}, {1, -1}, {-1, 1}};

        System.out.println(s1.solution(b));
        System.out.println(s1.solution(c));
    }
}
