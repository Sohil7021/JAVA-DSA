package Medium;

import java.util.Arrays;
import java.util.Spliterator;

public class Target_Sum {
  static   int total;

     static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int ans = findTargetSumWays(nums,5);
        System.out.println(ans);


    }
   static   int findTargetSumWays(int[] nums, int S) {
        total = Arrays.stream(nums).sum();

        int[][] memo = new int[nums.length][2 * total + 1];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return calculate(nums, 0, 0, S, memo);
    }

   static   int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
        if (i == nums.length) {
            if (sum == S) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (memo[i][sum + total] != Integer.MIN_VALUE) {
                return memo[i][sum + total];
            }
            int add = calculate(nums, i + 1, sum + nums[i], S, memo);
            int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
            memo[i][sum + total] = add + subtract;
            return memo[i][sum + total];
        }
    }


}

