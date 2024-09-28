package Interview_Master_100;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = mostWater(height);
        System.out.println(ans);

    }
    static int mostWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left],height[right]);
            int currentArea = minHeight * width;

            maxArea = Math.max(maxArea,currentArea);

            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
