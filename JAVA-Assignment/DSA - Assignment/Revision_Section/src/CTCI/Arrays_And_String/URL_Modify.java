package CTCI.Arrays_And_String;

public class URL_Modify {
    public static void main(String[] args) {
//        String s = "Mr John Smith";
//        String and = urlModify(s);
//        System.out.println(and);
//        char[] s = ""

    }
    static String urlModify(String s) {
        return s.replace(" ","%20");

    }
    static void URL(char[] s, int trueLength) {
        int spaceCount = 0;
        int index = 0;
        for (int i = 0; i < trueLength; i++) {
            if (s[i] == ' ') {
                spaceCount++;
            }

        }

        index = trueLength + s.length * 2;
        if (trueLength < s.length) {
            s[trueLength] = '\0';
        }

        for (int i = trueLength - 1; i >= 0 ; i--) {
            if (s[i] == ' ') {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index = index - 3;
            }else {
                s[index - 1] = s[i];
                index--;
            }
        }
    }
}
