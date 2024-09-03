package Interview_Master_100;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        int ans = buySell(price);
        System.out.println(ans);

    }
    static int buySell(int[] price) {
        if (price == null || price.length == 0) {
            return 0;
        }
        int minBuy = price[0];
        int profit = 0;
        for (int i = 0; i < price.length ; i++) {
            minBuy = Math.min(minBuy,price[i]);
            profit = Math.max(profit,price[i] - minBuy);
        }
        return profit;
    }
}
