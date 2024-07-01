import java.lang.reflect.Array;
import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipImage(image);

        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }



    }
    static int[][] flipImage(int[][] image) {
        for (int i = 0; i < image.length  ; i++) {
            int start = 0;
            int end = image[0].length - 1;

            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }

        }

        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[i].length ; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                }else if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}
