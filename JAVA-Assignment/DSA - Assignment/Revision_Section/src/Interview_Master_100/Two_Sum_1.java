package Interview_Master_100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = two_Sum(nums,9);
        System.out.println(Arrays.toString(ans));

    }
    static int[] two_Sum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (myMap.containsKey(complement)) {
                return new int[] {myMap.get(complement),i};
            }
            myMap.put(nums[i],i);
        }
        return null;

    }
}
