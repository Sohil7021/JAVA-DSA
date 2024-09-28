package Interview_Master_100;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static void main(String[] args) {
        List<String> ans = generateParenthesis(3);
        System.out.println(ans);

    }

    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;

    }

    static void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: if the current string is valid and complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add opening parenthesis if there are remaining open parentheses
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add closing parenthesis if the number of open is greater than close
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
