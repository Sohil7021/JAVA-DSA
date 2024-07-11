public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = {"a","bc"};
        String[] word2 = {"ab","c"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);

    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String w1 = "";
//        String w2 = "";
//
//        for (int i = 0; i < word1.length ; i++) {
//            w1 += word1[i];
//        }
//
//        for (int i = 0; i < word2.length ; i++) {
//            w2 += word2[i];
//        }
//
//        if (w1.equals(w2)) {
//            return true;
//        }
//
//        return false;


        StringBuilder sb1 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }

        // Convert second array to a single string
        StringBuilder sb2 = new StringBuilder();
        for (String s : word2) {
            sb2.append(s);
        }

        // Compare the two strings
        return sb1.toString().equals(sb2.toString());

    }
}
