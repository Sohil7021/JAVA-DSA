package Sorting;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {4,6,1,7,3,2,5};
        int ans = pivot(arr,0, arr.length-1);
        System.out.println(ans);

    }
    static void quick_Sort(int[] arr, int left, int right) {
        int pivotIndex = pivot(arr,left,right);
        quick_Sort(arr,left,pivotIndex-1);
        quick_Sort(arr,pivotIndex+1,right);
    }
    static int pivot(int[] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex ; i++) {
            if (arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr,pivotIndex,swapIndex);
        return swapIndex;

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
