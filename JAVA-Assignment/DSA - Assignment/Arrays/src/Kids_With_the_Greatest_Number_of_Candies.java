import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        List<Boolean> result = greaterCandies(candies,3);
        System.out.println(Arrays.toString(new List[]{result}));
    }
    static List<Boolean> greaterCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int num : candies) {
            max = Math.max(max,num);
        }

        List<Boolean> ans = new ArrayList<>();
        for (int num : candies) {
            ans.add(num + extraCandies >= max);
        }

        return ans;
    }
}
