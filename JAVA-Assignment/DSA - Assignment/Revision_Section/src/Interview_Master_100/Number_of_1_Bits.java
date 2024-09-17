package Interview_Master_100;

public class Number_of_1_Bits {
    public static void main(String[] args) {
        int n = bitCounts(11);
        System.out.println(n);

    }
    static int bitCounts(int n) {
//        return Integer.bitCount(n);
        int count = 0;
        while(n != 0) {
            count += (n & 1);
            n >>= 1;
        }
    return count;
    }
}
