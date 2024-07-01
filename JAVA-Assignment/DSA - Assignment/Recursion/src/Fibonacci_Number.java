public class Fibonacci_Number {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);

    }
    static int fibo(int n) {
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while(count <= n) {
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//
//        }
        if (n < 2) {
            return n;
        }


        return fibo(n-1) + fibo(n-2);
    }
}
