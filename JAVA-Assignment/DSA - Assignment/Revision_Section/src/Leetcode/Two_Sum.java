package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums,9);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int comp = target - nums[i];

            if(map.containsKey(comp)) {
                return new int[] {map.get(comp),i};
            }
            map.put(nums[i],i );
        }
        return null;
    }
}
