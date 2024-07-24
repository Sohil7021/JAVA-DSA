import java.util.Arrays;

public class Matrix_Cells_in_Distance_Order {
    public static void main(String[] args) {
        int[][] ans = allCellsDistOrder(1,2,0,0);
        for (int[] num : ans) {
            System.out.print(Arrays.toString(num));
        }
        System.out.println();

    }
    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][];
        result[0] = new int[] {rCenter,cCenter};
        int index = 1;
        int lim = Math.max(rCenter,rows - rCenter - 1) + Math.max(cCenter,cols-cCenter - 1);

        for (int dis = 0; dis <= lim ; dis++) {
            int r = rCenter - dis;
            int c = cCenter;


//            Top Left
            for (int count = dis; count > 0 ; count--) {
                if (r >= 0 && c >= 0) result[index++] = new int[] {r,c};
                r++;
                c--;
            }

//            Left Bottom

            for (int count = dis; count > 0; count--) {
                if (r < rows && c >= 0) result[index++] = new int[] {r,c};
                r++;
                c++;
            }
//            Bottom Right
            for (int count = dis; count > 0 ; count--) {
                if (r < rows && c < cols) result[index++] = new int[] {r,c};
                r--;
                c++;

            }

//            Top Right
            for (int count = dis; count > 0 ; count--) {
                if (r >= 0 && c < cols) result[index++] = new int[] {r,c};
                r--;
                c--;
            }





        }

        return result;

    }
}
