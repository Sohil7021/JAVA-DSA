import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans = createArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] createArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i],nums[i] );

        }

        for (int i = 0; i < ans.length ; i++) {
            ans[i] = list.get(i);
        }

        return ans;



    }
}
