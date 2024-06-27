import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersection_Array(nums1,nums2);
        System.out.println(Arrays.toString(ans));

    }
    static int[] intersection_Array(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for(int num : nums1) {
            set.add(num);
        }
        for(int nums : nums2) {
            if (set.contains(nums)) {
                intersect.add(nums);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;
        for(int num : intersect) {
            result[i++] = num;
        }

        return result;


    }
}
