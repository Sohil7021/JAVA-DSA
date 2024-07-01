public class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int ans = binarySearch(nums,9,0, nums.length - 1);
        System.out.println(ans);



    }
    static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return binarySearch(nums,target,mid+1,end);
        }

        return binarySearch(nums,target,start,mid-1);


    }
}
