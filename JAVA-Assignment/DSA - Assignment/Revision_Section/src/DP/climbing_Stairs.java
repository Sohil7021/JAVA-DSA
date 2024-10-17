package DP;

import java.util.Arrays;

public class climbing_Stairs {
    public static void main(String[] args) {
        int ans = space(3);
        System.out.println(ans);

    }
//    Brute Force Approach
    static int climbingStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        return climbingStairs(n-1) + climbingStairs(n-2);
    }

//    Top Down Approach
    static int topDown(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = topDown(n-1) + topDown(n-2);
        return dp[n];
    }

//    Bottom up Approach
    static int bottomUp(int n) {
        if(n <= 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }

//    Space Optimization
    static int space(int n) {
        int prev = 2;
        int prev2 = 1;
        for (int i = 3; i <= n ; i++) {
            int curr = prev2 + prev;
            prev2 = prev;
            prev = curr;
        }
        return prev;


    }

    static int climbing(int n) {
        if (n == 1) return 1;
        if (n == 2 ) return 2;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[n-2];
        }
        return dp[n];

    }


    static int spaceOptiMizeConcept(int n) {

        int prev2 = 1;
        int prev = 2;

        for (int i = 3; i <= n ; i++) {
            int temp = prev2 + prev;
            prev2 = prev;
            prev = temp;
        }
        return prev;
    }
}
