public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = pangram(sentence);
        System.out.println(ans);

    }
    static boolean pangram(String sentence) {

        for (int i = 0; i < 26 ; i++) {
            char ch = (char) ('a' + i);
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;

    }
}
