package Leetcode;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = consectiveCount(nums);
        System.out.println(ans);
    }
    static int consectiveCount(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            }else {
                count++;
            }

            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}
