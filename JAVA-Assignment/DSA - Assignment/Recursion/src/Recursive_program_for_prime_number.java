public class Recursive_program_for_prime_number {
    public static void main(String[] args) {
        boolean ans = prime_or_not(15,2);
        System.out.println(ans);

    }
    static boolean prime_or_not(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i*i > n) {
            return true;
        }
        return prime_or_not(n,i+1);


    }
}
