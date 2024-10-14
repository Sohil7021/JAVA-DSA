package Leetcode;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int ans = sequence(nums);
        System.out.println(ans);

    }
    static int sequence(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

//        Count long consecutive
        int longestStreak = 0;

        for (int num : set) {
//            num start of sequence
            if (!set.contains(num - 1)) {
                int curr = num;
                int currStreak = 1;

//                while count consecutive
                while (set.contains(curr + 1)) {
                    curr += 1;
                    currStreak += 1;
                }

                longestStreak = Math.max(longestStreak,currStreak);

            }
        }
        return longestStreak;
    }
}
