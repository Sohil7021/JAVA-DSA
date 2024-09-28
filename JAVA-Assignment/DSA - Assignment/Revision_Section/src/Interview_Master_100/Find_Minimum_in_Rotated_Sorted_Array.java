package Interview_Master_100;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int ans = finfMin(nums);
        System.out.println(ans);

    }

    static int finfMin(int[] nums) {
//        int start = 0;
//        int end = nums.length;
//        int min = nums[0];
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//              if (nums[mid] >= min) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//                min = nums[mid];
//            }
//
//        }
//        return min;


            int min = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++) {
                if(min > nums[i]) {
                    min = nums[i];
                }
            }
            return min;


    }
}
