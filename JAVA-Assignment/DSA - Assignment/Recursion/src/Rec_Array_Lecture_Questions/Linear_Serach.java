package Rec_Array_Lecture_Questions;

public class Linear_Serach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(linearSearch(arr,0,3));

    }
    static boolean linearSearch(int[] arr,int index, int target) {
        if (index == arr.length - 1) {
            return false;
        }

        return arr[index] == target || linearSearch(arr,index+1,target);
    }
}
