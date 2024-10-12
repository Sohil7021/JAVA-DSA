package Leetcode;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int ans = buySellStock(nums);
        System.out.println(ans);

    }
    static int buySellStock(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int minBuy = nums[0];
        int maxProfit = 0;
        for (int i = 0; i < nums.length; i++) {
            minBuy = Math.min(minBuy,nums[i]);
            maxProfit = Math.max(maxProfit,nums[i] - minBuy);
        }

        return maxProfit;
    }
}
