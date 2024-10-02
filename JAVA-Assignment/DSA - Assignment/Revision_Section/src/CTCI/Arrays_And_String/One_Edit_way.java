package CTCI.Arrays_And_String;

public class One_Edit_way {
    public static void main(String[] args) {
        boolean ans = onewayedit("pale","bae");
        System.out.println(ans);

    }
    static boolean onewayedit(String s1, String s2) {
//        Length Check
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        String first = s1.length() < s2.length() ? s1 : s2;
        String second = s1.length() < s2.length() ? s2 : s1;

        int index1 = 0;
        int index2 = 0;
        boolean isDifference = false;
        while (index2 < second.length() && index1 < first.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (isDifference) return false;
                isDifference = true;

                if (first.length() == second.length()) {
                    index1++;
                }
            }else {
                index1++;
            }
            index2++;
        }
        return true;

    }
}
