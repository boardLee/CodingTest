package mar;

import java.util.Arrays;

public class Solution230314 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        

        return result;
    }

    public static void main(String[] args) {
        int[] ex = {-4,-1,0,3,10};
        int[] result1 = new int[ex.length];

        Solution230314 s = new Solution230314();
        result1 = s.sortedSquares(ex);

        for(int i = 0; i < ex.length; i++) {
            System.out.println(i + " : " + result1[i]);

        }
    }
}
