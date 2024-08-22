package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,1};
        insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion_Sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int temp = arr[i];
            int j = i - 1;
            while ( j > -1 && temp < arr[j]) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
