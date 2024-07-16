package Medium;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ans = searchRange(nums,8);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1,-1};
        result[0] = firstOcc(nums,8);
        result[1] = secondOcc(nums,8);
        return result;

    }

    static int firstOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int firstTarget = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstTarget = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return firstTarget;

    }

    static int secondOcc(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int secondTarget = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                secondTarget = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return secondTarget;

    }
}
