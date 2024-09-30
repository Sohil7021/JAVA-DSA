package Interview_Master_100;

public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int ans = maxProduct(nums);
        System.out.println(ans);

    }
    static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(current,max * current);
            min = Math.min(current,min * current);

            result = Math.max(result,max);
        }
        return result;
    }
}
