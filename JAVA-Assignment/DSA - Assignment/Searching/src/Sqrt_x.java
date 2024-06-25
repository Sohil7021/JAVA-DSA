public class Sqrt_x {
    public static void main(String[] args) {
        int ans = sqrt(4);
        System.out.println(ans);

    }
    static int sqrt(int x) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid  == x/mid) {
                return mid;
            }else if(mid  > x/mid) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return end;

    }
}
