public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int ans = oddValues(2,3,indices);
        System.out.println(ans);



    }
    static int oddValues(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < indices.length ; i++) {
            row[indices[i][0]] += 1;
            col[indices[i][1]] += 1;

        }
        int odd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    odd += 1;
                }
            }
        }
        return odd;
    }
}
