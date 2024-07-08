public class length_of_a_string_using_recursion {
    public static void main(String[] args) {
        String str = "Hello";
        int ans = lenOfString(str);
        System.out.println(ans);

    }
    static int lenOfString(String str) {
        if (str.equals("")) {
            return 0;
        }

        return lenOfString(str.substring(1)) + 1;
    }
}
