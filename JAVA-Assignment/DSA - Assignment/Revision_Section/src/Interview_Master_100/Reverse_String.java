package Interview_Master_100;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s,0,s.length-1);
        System.out.println(Arrays.toString(s));



    }
    static void reverseString(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverseString(s,++i,--i);


    }
}
