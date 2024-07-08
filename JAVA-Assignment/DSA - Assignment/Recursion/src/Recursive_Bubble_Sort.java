import java.util.Arrays;

public class Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble_Sort(arr, arr.length );
        System.out.println(Arrays.toString(arr));

    }
    static void bubble_Sort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1 ; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubble_Sort(arr,n-1);



        }
    }

