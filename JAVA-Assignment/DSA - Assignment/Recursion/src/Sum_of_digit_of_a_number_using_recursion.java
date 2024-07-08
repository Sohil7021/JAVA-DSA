public class Sum_of_digit_of_a_number_using_recursion {
    public static void main(String[] args) {
        int n = 11;
        int ans = sum_of_Digit(n);
        System.out.println(ans);

    }
    static int sum_of_Digit(int n) {
        if (n < 2) {
            return n;
        }


        return (n%10 + sum_of_Digit(n/10));

    }
}
