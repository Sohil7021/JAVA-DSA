package Interview_Master_100;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int ans = binarySearch(arr, 9, 0, arr.length - 1);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, end);
            } else {
                return binarySearch(arr, target, 0, mid - 1);
            }

        }
    }

