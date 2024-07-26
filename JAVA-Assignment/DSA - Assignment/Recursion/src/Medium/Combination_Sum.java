package Medium;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] candidate = {2,3,5};
        int target = 8;

        List<List<Integer>> com = combiSum(candidate,target);
        for (List<Integer> arr : com) {
            System.out.println(arr);

        }




    }
    static List<List<Integer>>  combiSum(int[] candidate, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidate,target,0,new ArrayList<>(),result);
        return result;
    }

    static void backtrack(int[] candidate, int target, int start, List<Integer> current,
                          List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidate.length ; i++) {
            current.add(candidate[i]);
            backtrack(candidate,target-candidate[i],i,current,result);
            current.remove(current.size() - 1);

        }

    }
}
