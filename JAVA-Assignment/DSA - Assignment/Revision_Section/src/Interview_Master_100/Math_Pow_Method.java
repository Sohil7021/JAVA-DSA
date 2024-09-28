package Interview_Master_100;

public class Math_Pow_Method {
    public static void main(String[] args) {
        double ans = myPow(2,3);
        System.out.println(ans);



    }

    static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1/x;
            N = -N;
        }
        return power(x,n);
    }


    static double power(double x, int n) {
        if (n == 0) return 1.0;

        double half = power(x,n/2);
        if (n % 2 == 0) {
            return half * half;

        }else {
            return half * half * x;
        }
    }
}
