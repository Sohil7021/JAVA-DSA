package Interview_Master_100;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int ans = peakArray(nums);
        System.out.println(ans);
    }
    static int peakArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;

    }
}
