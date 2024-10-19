package Leetcode;

public class Find_Kth_Bit_in_Nth_Binary_String {
    public static void main(String[] args) {
        char ans = findKthBits1(4,11);
        System.out.println(ans);

    }
    static char findKthBit(int n, int k) {
        StringBuilder seq = new StringBuilder("0");
//        Generate seq
        for (int i = 1; i < n && k > seq.length(); i++) {
            seq.append("1");

//            Append invert and reverse
            for (int j = seq.length() - 1; j >= 0 ; j--) {
                char invertBit = (seq.charAt(j) == '1') ? '0' : '1';
                seq.append(invertBit);

            }

        }
        return seq.charAt(k-1);



    }
    static char findKthBits1(int n, int k) {
        int count = 0, l = (1 << n) - 1;
        while (k > 1) {
            if (k == l / 2 + 1)
                return count % 2 == 0 ? '1' : '0';
            if (k > l / 2) {
                k = l + 1 - k;
                count++;
            }
            l /= 2;
        }
        return count % 2 == 0 ? '0' : '1';
    }
}
