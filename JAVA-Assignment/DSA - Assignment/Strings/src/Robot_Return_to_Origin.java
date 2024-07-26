public class Robot_Return_to_Origin {
    public static void main(String[] args) {
        boolean ans = judgeCircle("UD");
        System.out.println(ans);

    }
    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(char ch : moves.toCharArray()) {
            if (ch == 'U') {
                y--;
            } else if (ch == 'D') {
                y++;
            } else if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            }
        }

        return x == 0 && y == 0;

    }
}
