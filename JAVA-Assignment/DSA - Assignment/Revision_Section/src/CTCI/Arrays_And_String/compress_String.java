package CTCI.Arrays_And_String;

public class compress_String {
    public static void main(String[] args) {
        String ans = compressed("aabcccccaaa");
        System.out.println(ans);

    }

    static String compressed(String s) {
        StringBuilder comp = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;

            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
                comp.append(s.charAt(i));
                comp.append(count);
                count = 0;
            }
        }

        return comp.length() < s.length() ? comp.toString() : s;

    }
}
