package Leetcode;

import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        setZero(matrix);
        for (int[] n : matrix) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println();

    }
    static void setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (matrix[i][j] == 0) {
                    row[i]  = true;
                    col[i] = true;
                }
            }


        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                if ( row[i]  || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }


    }

//    optimal approach
    static void setZero(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

//        Check first row is zero
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

//        check first col zero
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }

//        make firstRow and firstCol as zero
        for (int i = 1; i < row ; i++) {
            for (int j = 1; j < col ; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;

                }
            }
        }

//        Set matrix cell has to zero
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col ; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

//        Handle first row
        if(firstRow) {
            for (int i = 0; i < col ; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstCol) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }


    }
}