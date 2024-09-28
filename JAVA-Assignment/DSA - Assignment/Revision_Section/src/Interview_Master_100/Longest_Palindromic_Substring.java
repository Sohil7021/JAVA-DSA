package Interview_Master_100;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String s = "babad";
        String ans = longestPalindrome(s);
        System.out.println(ans);

    }
    static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return  "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
//            Odd length
            int len1 = expandAround(s,i,i);
//            Even length
            int len2 = expandAround(s,i,i+1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

            }
        return s.substring(start,end+1);
        }


    static int expandAround(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
