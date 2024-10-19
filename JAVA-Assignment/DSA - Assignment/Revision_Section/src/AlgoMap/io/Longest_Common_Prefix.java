package AlgoMap.io;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        String ans = longest(str);
        System.out.println(ans);

    }
static String longest(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];
    for (int i = 1; i < str.length ; i++) {
        while (str[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0,prefix.length() - 1);
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }
    return prefix;
}

}
