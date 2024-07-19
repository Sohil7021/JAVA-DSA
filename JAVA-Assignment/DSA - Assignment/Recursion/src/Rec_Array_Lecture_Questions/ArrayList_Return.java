package Rec_Array_Lecture_Questions;

import java.util.ArrayList;

public class ArrayList_Return {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> ans = array(arr,4,0,new ArrayList<>());
        System.out.println(ans);


    }
    static ArrayList<Integer> array (int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return array(arr,target,index+1,list);

    }
}
