package Leetcode;

public class Triplet_SubSequence {
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        boolean ans = triplet(nums);
        System.out.println(ans);

    }
    static boolean triplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= small) {
                small = n;
            } else if (n <= big) {
                big = n;
            }else {
                return true;
            }
        }
        return false;
    }
}
