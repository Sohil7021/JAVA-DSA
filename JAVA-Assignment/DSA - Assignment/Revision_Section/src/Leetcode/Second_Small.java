package Leetcode;

public class Second_Small {
    public static void main(String[] args) {
        int[] nums = {3,4,2,4,5};
        int ans = secondSmall(nums);
        System.out.println(ans);
    }
    static int secondSmall(int[] arr) {
//
        if (arr.length < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }


        }

        return secondMax;



    }
}
