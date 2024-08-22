package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,1,3};
        selection_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }

            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
