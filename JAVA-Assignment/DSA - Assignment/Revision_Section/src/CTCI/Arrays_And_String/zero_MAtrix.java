package CTCI.Arrays_And_String;

import java.util.Arrays;

public class zero_MAtrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        zeroMatrix(matrix);
        for (int[] n : matrix) {
            System.out.println(Arrays.toString(n));
        }

    }
    static void zeroMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;

                }
            }
        }

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (row[i] || row[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
