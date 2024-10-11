package DP;

import java.util.Arrays;

public class Triple_Set {
    public static void main(String[] args) {
        int ans = countWay2(3);
        System.out.println(ans);

    }
//    Brute Force
    static int countWay(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }else {
            return countWay(n-1) + countWay(n-2) + countWay(n-3);
        }
    }

//    DP
    static int countWay2(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return countWay3(n,memo);





    }
    static int countWay3(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        }else {
            memo[n] = countWay3(n-1,memo) + countWay3(n-2,memo) + countWay3(n-3,memo);
            return memo[n];
        }


    }
}
