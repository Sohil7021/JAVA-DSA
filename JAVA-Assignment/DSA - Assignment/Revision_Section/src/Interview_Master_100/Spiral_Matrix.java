package Interview_Master_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(Arrays.toString(new List[]{ans}));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while (true) {
            for (int i = left; i <= right ; i++)
                list.add(matrix[top][i]);

            top++;
            if (top > bottom || left > right)
                break;


            for (int i = top; i <= bottom ; i++)
                list.add(matrix[i][right]);

            right--;
            if (top > bottom || left > right)
                break;


            for (int i = right; i >= left ; i--)
                list.add(matrix[bottom][i]);

            bottom--;
            if (top > bottom || left > right)
                break;


            for (int i = bottom; i >= top ; i--)
                list.add(matrix[i][left]);

            left++;
            if (top > bottom || left > right)
                break;

        }
        return list;



    }
}
