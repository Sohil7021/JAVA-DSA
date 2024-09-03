package Interview_Master_100;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String  s = "A man, a plan, a canal: Panama";
        boolean ans = checkPalindrome(s);
        System.out.println(ans);

    }
    static boolean checkPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char left = s.charAt(start);
            char right = s.charAt(end);

            if (!Character.isLetterOrDigit(left)) {
                start++;
            } else if (!Character.isLetterOrDigit(end)) {
                end--;
            }else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;

    }
}
