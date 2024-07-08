public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] marix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans = matrix_Sum(marix);
        System.out.println(ans);

    }
    static int matrix_Sum(int[][] matrix) {
        int n = matrix.length;
        int ans = 0;

        for (int i = 0; i < n ; i++) {
            ans += matrix[i][i];
            ans += matrix[n-1-i][i];
        }

        if (n % 2 != 0) {
            ans -= matrix[n/2][n/2];
        }
        return ans;
    }
}
