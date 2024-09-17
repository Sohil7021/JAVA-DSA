package Interview_Master_100;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);

    }
    static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
           return false;
       }

       char[] str1 = s.toCharArray();
       char[] str2 = t.toCharArray();

       Arrays.sort(str1);
       Arrays.sort(str2);

       return Arrays.equals(str1, str2);
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        // Convert strings to character arrays
//        char[] str1 = s.toCharArray();
//        char[] str2 = t.toCharArray();
//
//        // Sort both character arrays
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//
//        // Compare sorted arrays
//        return Arrays.equals(str1, str2);


    }
}
