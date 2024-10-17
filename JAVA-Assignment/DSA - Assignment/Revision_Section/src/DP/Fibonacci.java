package DP;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
//        fibonacciN(7);

        int ans = fiboSpaceOpti(7);
        System.out.println(ans);

    }
    static int fibo(int n) {
//        Memoization - Bottom Up
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        if (dp[n] != -1) return dp[n];

        return dp[n] = fibo(n-1) + fibo(n-2);

    }
//    Tabulation - Bottom Up
    static void fibonacciN(int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];

        }
         System.out.println(dp[n]);

    }

//    Space optimization
    static int fiboSpaceOpti(int n) {
        int prev = 1;
        int prev2 = 0;
        for (int i = 2; i <= n ; i++) {
            int temp = prev2 + prev;
            prev2  = prev;
            prev = temp;

        }
        return prev;

    }


}
