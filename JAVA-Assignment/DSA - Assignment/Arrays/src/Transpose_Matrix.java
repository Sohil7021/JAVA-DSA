import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] ans = transpose(matrix);
        for (int[] num: ans) {
            System.out.println(Arrays.toString(num));
        }

    }

    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
