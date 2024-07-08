public class Power_Of_Four {
    public static void main(String[] args) {
        boolean ans = power_of_four(5);
        System.out.println(ans);

    }
    static boolean power_of_four(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if(n % 4 != 0) {
            return false;
        }else {
            return power_of_four(n/4);
        }
    }
}
