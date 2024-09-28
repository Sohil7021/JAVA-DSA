package Interview_Master_100;

public class Maximum_Sum_Circular_Subarray {
    public static void main(String[] args) {
        int[] nums = {5,-3,5};
        int ans = circular_sum(nums);
        System.out.println(ans);

    }
    static int circular_sum(int[] nums) {
       int totalSum = 0;
       int maxSum = Integer.MIN_VALUE;
       int currMax = 0;
       int minSum = Integer.MAX_VALUE;
       int currMin = 0;

       for(int n : nums) {
           totalSum += n;

//           Kadan's algorithm max sub array
           currMax = Math.max(currMax,0) + n;
           maxSum = Math.max(maxSum,currMax);

//           kadan's algorithm min sum array
           currMin = Math.min(currMin,0) + n;
           minSum = Math.min(minSum,currMin);

       }

       if (totalSum == minSum) {
        return maxSum;
       }
       return Math.max(maxSum,totalSum - minSum);
    }
}
