package Leetcode;

import java.util.Arrays;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] nums = {1,5,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void nextPermutation(int[] nums) {
        int n = nums.length;
//        Find largest Index
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

//        If such index found
        if (i>=0) {
//            Find largest index of j in i
            int j = n-1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);



    }
    static void swap(int[] nums, int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
