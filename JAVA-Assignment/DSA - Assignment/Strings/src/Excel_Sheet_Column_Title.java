public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        String col = convertToTitle(28);
        System.out.println(col);

    }
    static String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            s.append((char) ((columnNumber % 26) + 'A') );
            columnNumber = (columnNumber) / 26;
        }

        return s.reverse().toString();

    }
}
