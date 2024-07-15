package Medium;

import java.util.Arrays;

public class Spiral_Matrix_III {
    public static void main(String[] args) {
        int[][] ans = spiralMatrixIII(1,4,0,0);
        for (int[] arr : ans) {
            System.out.print(Arrays.toString(arr));
        }
        System.out.println();

    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols ][2];
        int[][] direction = {
                {0,1},
                {1,0},
                {0,-1},
                {-1,0}

        };
        int length = 0;
        int index = 0;
        int r = rStart;
        int c = cStart;
        int step = 1;
        result[0] = new  int[] {r,c};

        while(step < rows * cols) {
            if (index == 0 || index == 2) {
                length++;
            }

            for (int i = 0; i < length; i++) {
                r += direction[index][0];
                c+= direction[index][1];

                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[step] = new int[] {r,c};
                    step++;
                }
            }
            index = (index + 1) % 4;

        }
return result;


    }
}
