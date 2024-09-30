package Interview_Master_100;

import org.xml.sax.SAXNotRecognizedException;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = minWindow(s,t);
        System.out.println(ans);

    }
    static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Create a map to store the frequency of characters in string t
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // Variables to track the minimum window
        int left = 0, right = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        int required = tMap.size();
        int formed = 0;  // To track how many unique characters match the requirement
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // Expand the window by moving the right pointer
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            // Check if the current character matches the frequency in t
            if (tMap.containsKey(c) && windowMap.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }

            // Contract the window by moving the left pointer
            while (left <= right && formed == required) {
                // Update the minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                // Try to reduce the window size
                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (tMap.containsKey(leftChar) && windowMap.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
                    formed--;
                }

                left++;  // Shrink the window
            }

            right++;  // Expand the window
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
