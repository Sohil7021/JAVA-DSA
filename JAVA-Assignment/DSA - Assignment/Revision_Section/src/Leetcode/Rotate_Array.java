package Leetcode;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        k = k% nums.length;

//        Reverse a number
        swap(nums,0, nums.length-1);

//        swap till k times
        swap(nums,0,k-1);

//        Reverse rest of array
        swap(nums,k, nums.length-1);
        System.out.println(Arrays.toString(nums));



//
    }
    static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
