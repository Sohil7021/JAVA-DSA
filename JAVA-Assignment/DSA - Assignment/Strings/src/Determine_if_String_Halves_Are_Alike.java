public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "Book";
        boolean ans = halvesAreAlike(s);
        System.out.println(ans);


    }
    static boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;

        s = s.toLowerCase();
        String vowel = "aeiou";
        int firstCount = 0;
        int secondCount = 0;


        for (int i = 0; i <  mid; i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) {
                firstCount++;
            }

            if (vowel.indexOf(s.charAt(mid + i)) != -1) {
                secondCount++;
            }



        }

        return firstCount == secondCount;


    }
}
