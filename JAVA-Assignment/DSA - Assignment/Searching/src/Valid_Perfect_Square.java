public class Valid_Perfect_Square {
    public static void main(String[] args) {
        boolean ans = perfectSquare(14);
        System.out.println(ans);


    }
    static boolean perfectSquare(int num) {
        if(num == 1) {
            return true;
        }
        int start = 1;
        int end = num / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}
