public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        String str = "geeksforGeeKS";
        String ans = char_Later(str);
        System.out.println(ans);
    }

    static String char_Later(String str) {
        String ans = String.valueOf(helper(str,0));
        return ans;

    }

    static char helper(String str, int i) {
        if (str.charAt(i) == '\0') {
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }

        return helper(str,i+1);

    }
}
