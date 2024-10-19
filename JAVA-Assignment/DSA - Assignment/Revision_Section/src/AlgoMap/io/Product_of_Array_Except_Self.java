package AlgoMap.io;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = product(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] product(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 1;
        int right = 1;
        for (int i = n-1; i >=0 ; i--) {
            ans[i] = right;
            right *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] *= left;
            left *= nums[i];
        }
        return ans;
    }
}
