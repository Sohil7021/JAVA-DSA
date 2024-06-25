public class Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {

    }
    static int guess(int n) {
        int start = 0;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(guess(mid) == 0) {
                return mid;
            }else if(guess(mid) == -1) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

