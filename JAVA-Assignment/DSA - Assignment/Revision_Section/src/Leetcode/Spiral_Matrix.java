package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> ans = spiral_Order(matrix);
        System.out.println(ans);


    }
    static List<Integer> spiral_Order(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (true) {
//            Top
            for (int i = left; i <= right ; i++)
                result.add(matrix[top][i]);


            top++;
            if (left > right || top > bottom) break;

//            Right
            for (int i = top; i <= bottom ; i++)
                result.add(matrix[i][right]);


            right--;
            if (left > right || top > bottom) break;

//            Bottom
            for (int i = right; i >= left ; i--)
                result.add(matrix[bottom][i]);


            bottom--;
            if (left > right || top > bottom) break;

//            Left
            for (int i = bottom; i >= top ; i--)
                result.add(matrix[i][left]);


            left++;
            if (left > right || top > bottom) break;


        }

        return result;


    }
}
