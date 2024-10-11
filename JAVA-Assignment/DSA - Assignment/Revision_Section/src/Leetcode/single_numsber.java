package Leetcode;

public class single_numsber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int ans = number(nums);
        System.out.println(ans);
    }
    static int number(int[] nums) {
        int result = 0;
        for(int n : nums) {
            result ^= n;
        }
        return result;
    }
}
