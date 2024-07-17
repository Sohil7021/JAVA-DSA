import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int ans = maximumProduct(nums);
        System.out.println(ans);

    }
    static int maximumProduct(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//
//        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
//        int product2 = nums[0] * nums[1] * nums[n-1];
//
//        return Math.max(product1,product2);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i : nums) {
            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2 && i != max1) {
                max3 = max2;
                max2 = i;
            } else if (i > max3 && i != max2 && i!= max1) {
                max3 = i;
            }

            if ( i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);

    }
    }


