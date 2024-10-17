package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = subArray(nums,3);
        System.out.println(ans);
    }


    static  int subArray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int curr = 0;

        for (int n : nums) {
            curr += n;


            if (map.containsKey(curr - k)) {
                count += map.get(curr - k);
            }

            map.put(curr,map.getOrDefault(curr,0) + 1);
        }
        return count;
    }


//    static int subArray(int[] nums, int k) {
//
////        int count = 0;
////        for (int i = 0; i < nums.length ; i++) {
////            int sum = 0;
////            for (int j = i; j < nums.length ; j++) {
////                sum += nums[j];
////
////                if (sum == k) {
////                    count++;
////
////                }
////            }
////
////        }
////
////        return count;
//
//
//    }
}
