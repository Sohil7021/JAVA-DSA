public class Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;



    }
    static int[] sumChecked(int[] numbers, int target ) {
        for (int i = 0; i < numbers.length ; i++) {
            int complement = target - numbers[i];
            int index = binarySearch(numbers,complement,0, numbers.length - 1);

            if (index != -1) {
                return new int[] {i+1, index+1};
            }

        }
        return new int[]{-1,-1};
    }

    static int binarySearch(int[] numbers, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
