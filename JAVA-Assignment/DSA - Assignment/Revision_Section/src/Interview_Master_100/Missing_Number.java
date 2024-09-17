package Interview_Master_100;

import java.util.ArrayList;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumberCyclicSort(nums);
        System.out.println(ans);

    }
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return n * (n + 1) / 2 - sum;

    }

    static int missingNumberCyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums,i,correctIndex);

            }else {
                i++;
            }
        }


        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;

            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
