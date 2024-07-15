package Medium;

import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int[][] ans = generateMatrix(3);
        for (int[] arr : ans) {
            System.out.print(Arrays.toString(arr));
        }
        System.out.println();

    }
    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int val = 1;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while (val <= n * n) {

//              Top
            for (int i = left; i <= right ; i++) {
                matrix[top][i] = val++;
            }
            top++;

//            Right
            for (int i = top; i <= bottom  ; i++) {
                matrix[i][right] = val++;
            }
            right--;

//            Bottom
            for (int i = right; i >= left ; i--) {
                matrix[bottom][i] = val++;
            }
            bottom--;

//            Left
            for (int i = bottom; i >= top ; i--) {
                matrix[i][left] = val++;
            }
            left++;



        }
        return matrix;

    }
}
