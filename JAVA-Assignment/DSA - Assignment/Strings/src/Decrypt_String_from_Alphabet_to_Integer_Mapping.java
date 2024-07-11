public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        String ans = freqAlphabets(s);
        System.out.println(ans);

    }
    static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == '#') {
                ans.append((char) ('a' +(s.charAt(i-1) - '0') + 10* (s.charAt(i-2) - '0') - 1));
                i -= 2;
            }else {
                ans.append((char) ('a' + (s.charAt(i) - '0') - 1));
            }

        }

        ans.reverse();
        return ans.toString();


    }
}
