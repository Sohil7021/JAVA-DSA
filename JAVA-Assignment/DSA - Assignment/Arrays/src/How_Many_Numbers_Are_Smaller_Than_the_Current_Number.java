import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smaller(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] smaller(int[] nums) {
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < nums.length ; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length ; j++) {
//                if (nums[i] > nums[j]) {
//                    count++;
//                }
//
//            }
//            ans[i] = count;
//        }
//
//        return ans;

        int[] count = new int[101];
        for(int num : nums) {
            count[num]++;
        }

        for(int i=1;i<count.length;i++) {
            count[i] += count[i-1];
        }

        int[] smallerCount = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0) {
                smallerCount[i] = count[nums[i] - 1];
            }
        }

        return smallerCount;


    }
}
