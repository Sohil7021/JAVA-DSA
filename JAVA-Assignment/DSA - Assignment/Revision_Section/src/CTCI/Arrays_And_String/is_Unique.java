package CTCI.Arrays_And_String;

import java.util.HashSet;

public class is_Unique {
    public static void main(String[] args) {
        String str = "abcd";
        boolean ans = isUnique2(str);
        System.out.println(ans);

    }
    static boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }

        }
        return true;
    }

//    without using data structure
    static boolean isUnique2(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);

            if (charSet[c]) {
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }

//    using bit  Manipulation
    static boolean isUnique3(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }


}
