package Medium;

import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
       for (int[] arr : matrix) {
           System.out.print(Arrays.toString(arr));
       }
        System.out.println();

    }
    static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
