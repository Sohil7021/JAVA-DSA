package LCE;

public class Fibonnaci_series {
    public static void main(String[] args) {
        int result = fibo(7);
        System.out.println(result);
    }
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
