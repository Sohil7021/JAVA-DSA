import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = duplicate(nums);
        System.out.println(ans);

    }
    static boolean duplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {
            if (set.contains(nums[i])) {
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
