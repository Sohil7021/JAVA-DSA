package CTCI.Arrays_And_String;

public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        boolean ans = rotate(matrix);
        System.out.println(ans);

    }
    static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length  != matrix[0].length) return false;
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int first = i;
            int last = n - 1 - i;

            for (int j = first; j < last ; j++) {
                int offset = j - first;
//                Top
                int top = matrix[first][j];

//                Left to top
                matrix[first][j] = matrix[last - offset][first];

//                Bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];

//                Right to bottom
                matrix[last][last - offset] = matrix[i][last];
//              top to right
                matrix[i][last] = top;

            }
        }

        return true;


    }
}
