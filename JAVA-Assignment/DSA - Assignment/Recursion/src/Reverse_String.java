import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse_Strings(s);
        System.out.println(Arrays.toString(s));

    }
    static void reverse_Strings(char[] s) {
        int i = 0;
        int j = s.length - 1;

        helper(s,i,j);

    }

    static void helper(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        helper(s,++i,--j);
    }
}
