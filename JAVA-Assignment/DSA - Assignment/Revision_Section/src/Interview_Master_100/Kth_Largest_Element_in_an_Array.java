package Interview_Master_100;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int ans = largestElement(nums, 2);
        System.out.println(ans);

    }
    static int largestElement(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length - k];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : nums) {
            queue.offer(n);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.peek();

    }
}
