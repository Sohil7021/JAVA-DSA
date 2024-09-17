package Interview_Master_100;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int ans = maxSubArray(nums);
        System.out.println(ans);

    }
    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max,sum);

            if (sum < 0) {
                sum = 0;

            }
        }
        return max;
    }
}
