import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] result = shuffle(nums,3);
        System.out.println(Arrays.toString(result));

    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int index = 0;

        for (int i = 0; i < n ; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i+n];
        }
        return ans;
    }
}
