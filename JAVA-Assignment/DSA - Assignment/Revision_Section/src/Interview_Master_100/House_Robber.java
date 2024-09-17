package Interview_Master_100;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = houseRobber(nums);
        System.out.println(ans);

    }
    static int houseRobber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev1 = 0;
        int prev2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = prev1;
            prev1 = Math.max(prev1,prev2 + nums[i]);
            prev2 = temp;
        }
        return prev1;
    }
}
