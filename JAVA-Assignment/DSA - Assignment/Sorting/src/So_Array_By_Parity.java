import java.util.Arrays;

public class So_Array_By_Parity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2  > nums[j] % 2 ) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] % 2 == 0) {
                i++;
            }
            if (nums[j] % 2 == 1) {
                j--;
            }
        }
        return nums;

    }
}
