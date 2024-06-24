public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int ans = wealth(accounts);
        System.out.println(ans);
    }
    static int wealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length ; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length ; j++) {

                sum += accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
