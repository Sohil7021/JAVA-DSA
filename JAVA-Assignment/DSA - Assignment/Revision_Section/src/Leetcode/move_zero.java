package Leetcode;

import java.util.Arrays;

public class move_zero {
    public static void main(String[] args) {
        int[] nums = {0,1,3,0,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void moveZeros(int[] nums) {
        int zeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
            }
        }
    }
}
