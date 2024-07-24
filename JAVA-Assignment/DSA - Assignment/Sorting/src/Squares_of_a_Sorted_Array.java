import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));

    }

        static int[] sortedSquares(int[] nums) {
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < nums.length - 1 ; i++) {
//                ans[i] = nums[i] * nums[i];
//            Arrays.sort(nums);
//            }
//            Arrays.sort(ans);
//
//        return ans;

            int[] ans = new int[nums.length];
            int start = 0;
            int end = nums.length - 1;
            int index = nums.length - 1;

            while (start <= end) {
                if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                    ans[index] = nums[start] * nums[start];
                    start++;
                } else {
                    ans[index] = nums[end] * nums[end];
                    end--;
                }
                index--;

            }

            return ans;





    }
}
