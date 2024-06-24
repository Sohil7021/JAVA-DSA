public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = pair(nums);
        System.out.println(ans);

    }
    static int pair(int[] nums) {
        int count = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = i+1; j < nums.length ; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }

        int[] ans = new int[101];
        for(int n : nums) {
            count += ans[n];
            ans[n]++;
        }
        return count;
    }
}
