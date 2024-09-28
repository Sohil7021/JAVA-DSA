package Interview_Master_100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_Missing_and_Repeated_Values {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3},
                {2,2}
        };
        int[] ans = repetedNumber(matrix);
        System.out.println(Arrays.toString(ans));

    }
    static int[] repetedNumber(int[][] grid) {
       int n = grid.length;
       int size = n * n;
       
       int[] freq = new int[size + 1];
       int missing = -1;
       int repeated = -1;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                freq[grid[i][j]]++;
            }
        }

        for (int i = 1; i <= size ; i++) {
            if (freq[i] == 0) {
                missing = i;
            }else if (freq[i] == 2){
                repeated = i;
            }
        }
        return new   int[] {repeated ,missing};

    }
}

