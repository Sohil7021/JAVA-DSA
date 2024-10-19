package AlgoMap.io;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        List<String> ans = summary(nums);
        System.out.println(ans);

    }
    static List<String> summary(int[] nums) {
        List<String > result = new ArrayList<>();
        if (nums == null || nums.length == 0 ) {
            return result;
        }

        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i-1] + 1) {
                if (start == nums[i-1]) {
                    result.add(String.valueOf(start));
                }else {
                    result.add(start + "->" + nums[i-1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        return result;
    }
}
