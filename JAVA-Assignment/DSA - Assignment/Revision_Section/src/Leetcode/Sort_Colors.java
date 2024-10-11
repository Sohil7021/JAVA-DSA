package Leetcode;

import java.util.Arrays;

public class Sort_Colors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 :
                    swap(nums,low,mid);
                    low++;
                    mid++;
                    break;

                case 1 :
                    mid++;
                    break;

                case 2 :
                    swap(nums,mid,high);
                    high--;
                    break;
            }
        }


    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
