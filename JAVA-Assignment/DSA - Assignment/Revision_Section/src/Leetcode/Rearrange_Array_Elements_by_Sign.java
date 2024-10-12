package Leetcode;

import java.util.Arrays;

public class Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));


    }
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int posIndxe = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                ans[posIndxe] = nums[i];
                posIndxe += 2;
            }else {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;

    }
}
