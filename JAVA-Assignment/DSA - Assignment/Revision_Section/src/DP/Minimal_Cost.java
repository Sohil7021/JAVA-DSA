package DP;

import java.util.Arrays;

public class Minimal_Cost {
    public static void main(String[] args) {
        int[] arr = {10,30,40,50,20};
//        int ans = minimalCost(arr,3);
        int ans = memo(arr,3);
        System.out.println(ans);
    }
    static int minimalCost(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int i = 1; i < n ; i++) {
            int mmStep = Integer.MAX_VALUE;

            for (int j = 1; j <= k ; j++) {
                if (i - j >= 0) {
                    int jump = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                    mmStep = Math.min(jump,mmStep);
                }
            }
            dp[i] = mmStep;
        }
        return dp[n-1];
    }

//    Memoization
    static int memo(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return top(n-1,arr,dp,k);


    }
    static int top(int n, int[] arr, int[] dp, int k) {
        if(n == 0) return 0;
        if(dp[n] != -1) {
            return dp[n];
        }
        
        int mmStep = Integer.MAX_VALUE;
        for (int i = 1; i <= k ; i++) {
            if (n - i >= 0) {
                int jump = top(n-i,arr,dp,k) + Math.abs(arr[n] - arr[n-i]);
                mmStep = Math.min(mmStep,jump);
            }
            
        }
        return dp[n] = mmStep;

    }
}
