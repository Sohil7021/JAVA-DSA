package Interview_Master_100;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = longest(s);
        System.out.println(ans);

    }
    static int longest(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0; int right = 0; int maxLength = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength,right - left);
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }


}
