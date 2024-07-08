public class Power_of_Three {
    public static void main(String[] args) {
        boolean ans = power_Of_Three(27);
        System.out.println(ans);

    }
    static boolean power_Of_Three(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }
        if (n % 3 == 0) {
            return power_Of_Three(n/3);
        }
        return false;
    }
}
