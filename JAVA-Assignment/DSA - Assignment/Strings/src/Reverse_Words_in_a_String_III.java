public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);

    }
    static String reverseWords(String s) {
        StringBuilder Originalstring = new StringBuilder();

        String[] word = s.split(" ");

        for(String ch : word  ) {
            Originalstring.append(new StringBuilder(ch).reverse().toString()).append(" ");
        }

        return Originalstring.toString().trim();

    }
}
