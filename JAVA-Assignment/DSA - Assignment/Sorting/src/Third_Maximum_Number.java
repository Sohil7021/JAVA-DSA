public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int ans = thirdMax(nums);
        System.out.println(ans);


    }
    static int thirdMax(int[] nums) {
        long fmax = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for(int i : nums) {
            if (i > fmax) {
                tmax = smax;
                smax = fmax;
                 fmax = i;
            } else if (i > smax &&  i!= fmax) {
                tmax = smax;
                smax = i;
            } else if (i > tmax && i != smax && i!= fmax) {
                tmax = i;
            }
        }

        return tmax == Long.MIN_VALUE ? (int) fmax : (int)tmax;

    }
}
