public class RecursivePrograms_to_find_Minimum_Maximum_elements_of_array {
    public static void main(String[] args) {
        int[] arr = {4,5,1,0,2};
        int ans = findMin(arr, arr.length);
        System.out.println("MIN:-");
        System.out.println(ans);
        int result = findMax(arr,arr.length);
        System.out.println("MAX:-");
        System.out.println(result);

    }
    static int findMin(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1],findMin(arr,n-1));



    }

    static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n-1],findMax(arr,n-1) );
    }
}
