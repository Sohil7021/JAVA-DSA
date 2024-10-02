package CTCI.Arrays_And_String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Check_Permutation {
    public static void main(String[] args) {
        String s = "god";
        String t = "dog";
        boolean ans = isPermutation2(s,t);
        System.out.println(ans);
    }
    static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first,second);
    }

    static boolean isPermutation2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length() ; i++) {
            letters[t.charAt(i)]--;


        }
        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }
        return true;


    }
}
