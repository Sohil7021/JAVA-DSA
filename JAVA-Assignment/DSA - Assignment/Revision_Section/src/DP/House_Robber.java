package DP;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {

    }
    static int memo(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return topMemo(nums,dp,n-1);

    }
    static int topMemo(int[] nums, int[] dp, int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) return nums[n];

        if (dp[n] != -1) {
            return dp[n];
        }

        int pick = topMemo(nums,dp,n-2);
        int notpick = topMemo(nums,dp,n-1);

        return dp[n] = Math.max(pick,notpick);

    }
}
