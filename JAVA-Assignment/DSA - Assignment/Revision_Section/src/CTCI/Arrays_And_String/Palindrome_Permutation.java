package CTCI.Arrays_And_String;

public class Palindrome_Permutation {
    public static void main(String[] args) {
        String s = "tact coa";
        boolean ans = isPermutation(s);
        System.out.println(ans);

    }
    static boolean isPermutation(String s) {
        int oddCount = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : s.toCharArray()) {
            int x =  Character.getNumericValue(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    oddCount++;
                }else {
                    oddCount--;
                }
            }
        }
        return oddCount <= 1;
    }
}
