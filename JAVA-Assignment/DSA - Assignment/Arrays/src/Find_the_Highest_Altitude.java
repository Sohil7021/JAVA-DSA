public class Find_the_Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = maxAltitude(gain);
        System.out.println(ans);
    }
    static int maxAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < gain.length ; i++) {
            current += gain[i];


            max = Math.max(max,current);

        }
        return max;
    }
}
