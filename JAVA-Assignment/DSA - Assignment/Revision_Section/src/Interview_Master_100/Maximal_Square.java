package Interview_Master_100;

public class Maximal_Square {
    public static void main(String[] args) {
        char[][] matrix = {
                {'0','1'},
                {'1','0'}
        };
        int ans = maximal_Square(matrix);
        System.out.println(ans);

    }
    static int maximal_Square(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1]; // DP table to store the size of square till that cell
        int maxSide = 0; // Variable to keep track of the maximum size of the square found

        // Iterate through the matrix
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    // DP relation to check for the minimum of the surrounding squares
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]); // Update the maximum side length
                }
            }
        }

        // Return the area of the largest square
        return maxSide * maxSide;
    }
}
