package Interview_Master_100;

import java.util.Stack;

public class Valid_Parentheses_2 {
    public static void main(String[] args) {
        String s = "([])";
        boolean ans = isValid(s);
        System.out.println(ans);


    }
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();

            }else {
                return false;
            }
        }

       return stack.isEmpty();


    }
}
