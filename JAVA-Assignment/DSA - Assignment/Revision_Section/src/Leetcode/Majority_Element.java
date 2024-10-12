package Leetcode;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorElement(nums);
        System.out.println(ans);

    }
    static int majorElement(int[] nums) {
        int count = 0;
        int major = 0;

        for(int n : nums) {
            if(count == 0) {
                major = n;
            }

            if (major == n) {
                count++;
            }else {
                count--;
            }
        }
        return major;
    }
}
