package Leetcode;

public class sorted_Array {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        boolean ans = sprted(arr);
        System.out.println(ans);

    }
    static boolean sprted(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i+1) % n]) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}
