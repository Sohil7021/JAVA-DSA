import java.util.Arrays;

public class Recursive_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertion_Sort(arr, arr.length );
        System.out.println(Arrays.toString(arr));

    }
    static void insertion_Sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }

        insertion_Sort(arr,n-1);
        int last = arr[n-1];
        int j = n-2;

        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;

    }

//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
}
