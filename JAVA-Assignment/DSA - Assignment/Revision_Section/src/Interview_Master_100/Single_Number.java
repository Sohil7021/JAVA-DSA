package Interview_Master_100;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {4,2,1,2,1};
        int ans = singleNumber(nums);
        System.out.println(ans);

    }
    static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
