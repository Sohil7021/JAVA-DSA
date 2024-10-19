package AlgoMap.io;

public class Find_Closest_NUmber {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        int ans = closest_Zero(nums);
        System.out.println(ans);
    }
    static int closest_Zero(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int closest = nums[0];
        for (int n : nums) {
            if (Math.abs(n) < Math.abs(closest) ||
                    (Math.abs(n) == Math.abs(closest) && n > closest)) {
                closest = n;
            }

        }
        return closest;


    }
}
