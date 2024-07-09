public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int ans = findKthPositive(arr,5);
        System.out.println(ans);

    }

    static int findKthPositive(int[] arr, int k) {
//        int missCount = 0;
//        int num = 1;
//        int i = 0;
//
//        while (missCount < k) {
//            if (i < arr.length && arr[i] == num) {
//                i++;
//            }else {
//                missCount++;
//            }
//            if (missCount < k) {
//                num++;
//            }
//        }
//        return num;

        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] - mid - 1 >= k) {
                ans = mid;
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }

        return ans + k;
    }
}