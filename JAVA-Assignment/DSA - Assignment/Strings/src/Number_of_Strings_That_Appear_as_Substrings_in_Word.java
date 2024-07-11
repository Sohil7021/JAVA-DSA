public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int ans = numOfStrings(patterns,word);
        System.out.println(ans);

    }
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length ; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        return count;

    }
}
