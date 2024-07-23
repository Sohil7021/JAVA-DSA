package Medium;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int ans = findMin(nums);
        System.out.println(ans);

    }
    static int findMin(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//
//        int min = nums[0];
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if(nums[mid] >= min) {
//                start = mid + 1;
//
//            }else {
//                min = nums[mid];
//                end = mid - 1;
//            }
//        }
//
//        return min;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1 ; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }

        return min;



    }
}
