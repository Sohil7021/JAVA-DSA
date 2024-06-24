import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));

    }
    static int[] runningSum(int[] nums) {

        int sum = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;

    }
}
