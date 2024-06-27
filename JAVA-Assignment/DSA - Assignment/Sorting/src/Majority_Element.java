public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majority(nums);
        System.out.println(ans);

    }
    static int majority(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int num: nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
