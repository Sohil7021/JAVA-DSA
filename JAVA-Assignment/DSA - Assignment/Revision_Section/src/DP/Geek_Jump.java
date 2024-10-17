package DP;

import java.awt.*;
import java.util.Arrays;

public class Geek_Jump {
    public static void main(String[] args) {
        int[] jump = {30,10,60 , 10 , 60 , 50};
        int ans = spaceOptiMize(jump,jump.length);
        System.out.println(ans);


    }
    static int geekJump(int[] arr, int n) {
       int[] dp = new int[n];
       Arrays.fill(dp,-1);
       dp[0] = 0;

        for (int i = 1; i < n ; i++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            if (i > 1) {
                jumpTwo = dp[i-2] + Math.abs(arr[i] - arr[i-2]);

            }
            dp[i] = Math.min(jumpOne,jumpTwo);

        }
        return dp[n-1];

    }

    static int spaceOptiMize(int[] arr, int n) {
        int prev2 = 0;
        int prev = 0;
        for (int i = 1; i < n ; i++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = prev + Math.abs(arr[i] - arr[i-1]);
            if (i > 1) {
                jumpTwo = prev2 + Math.abs(arr[i] - arr[i-2]);
            }

            int curr = Math.min(jumpOne,jumpTwo);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
