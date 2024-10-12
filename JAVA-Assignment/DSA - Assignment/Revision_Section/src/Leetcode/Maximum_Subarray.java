package Leetcode;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = max_SubArray(nums);
        System.out.println(ans);

    }
    static int max_SubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max,sum);

            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
