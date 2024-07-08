public class Geek_onacci_Number {
    public static void main(String[] args) {
        int a = 1; // First Geek-onacci number
        int b = 2; // Second Geek-onacci number
        int c = 3; // Third Geek-onacci number
        int n = 5; // Position in the sequence


        int result = geekOnacci(a,b,c,n);
        System.out.println(result);

    }
    static int geekOnacci(int a, int b, int c, int n) {
        if (n == 1) return a;
        if (n==2) return b;
        if (n==3) return c;

        return geekOnacci(a,b,c,n-1) + geekOnacci(a,b,c,n-2) + geekOnacci(a,b,c,n-3);
    }

}
