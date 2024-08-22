package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,9};
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
     static void bubble_Sort(int[] arr) {
         for (int i = arr.length - 1; i > 0 ; i--) {
             for (int j = 0; j < i; j++) {
                 if (arr[j] > arr[j+1]) {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
         }

     }
}
