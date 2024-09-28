package Interview_Master_100;

import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,0,5},
                {6,7,8}
        };
        setZeros(matrix);
        for (int[] n : matrix) {
            System.out.println(Arrays.toString(n));
        }

    }

    static void setZeros(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowZero[i] || rowZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
