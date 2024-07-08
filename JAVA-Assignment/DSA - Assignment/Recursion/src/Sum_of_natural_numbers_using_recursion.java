public class Sum_of_natural_numbers_using_recursion {
    public static void main(String[] args) {
        int num =sum(6);
        System.out.println(num);

    }
    static int sum(int n) {
        if (n < 2) {
            return n;
        }
        return n + sum(n-1);
    }
}
