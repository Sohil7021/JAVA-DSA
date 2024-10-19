package AlgoMap.io;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqr";
        String  ans = merge(w1,w2);
        System.out.println(ans);

    }
    static String merge(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                s.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                s.append(word2.charAt(j));
                j++;
            }
        }
        return s.toString();
    }
}
