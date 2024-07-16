package Medium;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int ans = search(nums,0);
        System.out.println(ans);

    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            } else   {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }

            }
        }
        return -1;

    }

}
