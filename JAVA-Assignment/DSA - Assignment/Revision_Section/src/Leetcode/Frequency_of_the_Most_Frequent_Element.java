package Leetcode;

import java.util.Arrays;

public class Frequency_of_the_Most_Frequent_Element {
    public static void main(String[] args) {
        int[] nums = {3,9,6};
        int ans = freq(nums,5);
        System.out.println(ans);
    }
    static int freq(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int curr = 0;

        for (int right = 0; right < nums.length ; right++) {
            int target = nums[right];
            curr += target;

            if ((right - left + 1) * target - curr > k) {
                curr -= nums[left];
                left++;

            }

        }
        return nums.length - left;
    }
}
