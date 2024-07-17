import java.util.Arrays;

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] ans = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(ans));

    }
   static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < n && oddIndex < n) {
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            } else if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }else {
                swap(nums,evenIndex,oddIndex);
            }
        }

        return nums;


    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }

