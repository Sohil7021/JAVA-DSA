public class Power_Of_Two {
    public static void main(String[] args) {
        boolean n = power_Two(3);
        System.out.println(n);

    }
    static boolean power_Two(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {
            return false;
        }else {
            return power_Two(n/2);
        }



    }
}
