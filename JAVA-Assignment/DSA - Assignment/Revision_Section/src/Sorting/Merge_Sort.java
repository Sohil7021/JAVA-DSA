package Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
//        int[] arr1 = {5,4,3,2};
//        int[] arr2 = {1,4,5,7};
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(merge_Sort(arr)));

    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[index] = arr1[i];
                index++;
                i++;
            }else {
                combined[index] = arr2[j];
                index++;
                j++;
            }

        }

        while (i < arr1.length) {
            combined[index] = arr1[i];
            index++;
            i++;
        }

        while (j < arr2.length) {
            combined[index] = arr2[j];
            index++;
            j++;
        }

        return combined;
    }

    static int[] merge_Sort(int[] arr) {
        if (arr.length == 1) return arr;
        int minIndex = arr.length / 2;
        int[] left = merge_Sort( Arrays.copyOfRange(arr,0,minIndex));
        int[] right = merge_Sort( Arrays.copyOfRange(arr,minIndex,arr.length));

        return merge(left,right);




    }
}
