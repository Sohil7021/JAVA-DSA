package Interview_Master_100;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3,3,2};
        int ans = majorityElement(nums);
        System.out.println(ans);

    }
    static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int n : nums) {
            if(count == 0) {
                candidate = n;
            }

            if (n == candidate) {
                count++;
            }else {
                count--;
            }
        }
        return candidate;

    }
}
