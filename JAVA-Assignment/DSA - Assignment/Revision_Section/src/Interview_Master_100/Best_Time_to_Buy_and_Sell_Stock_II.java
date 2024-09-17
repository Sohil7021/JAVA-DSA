package Interview_Master_100;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int ans = maxProfit(nums);
        System.out.println(ans);
    }
    static int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 1; i < prices.length ; i++) {
            if(prices[i] > prices[i-1]) {
                max += prices[i] - prices[i-1];
            }

        }
        return max;

    }
}
