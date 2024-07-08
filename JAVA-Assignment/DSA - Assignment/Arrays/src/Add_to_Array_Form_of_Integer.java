import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public static void main(String[] args) {
        int[] nums = {1,2,0,0};
        List<Integer> ans = addToArrayForm(nums,34);
        System.out.println(ans);

    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int cur = k;

        ArrayList<Integer> list = new ArrayList<>();
         int i = n;

         while (--i >= 0 || cur > 0) {
             if (i >= 0) {
                 cur += num[i];
                 list.add(cur % 10);
                 cur /= 10;
             }

         }
        Collections.reverse(list);
         return list;



    }
}
