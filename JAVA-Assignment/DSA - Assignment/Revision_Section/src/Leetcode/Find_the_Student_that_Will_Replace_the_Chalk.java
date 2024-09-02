package Leetcode;

public class Find_the_Student_that_Will_Replace_the_Chalk {
    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int ans = findReplaceChalk(chalk,25);
        System.out.println(ans);
    }
    static int findReplaceChalk(int[] chalk, int k) {
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if (sum > k) {
                break;
            }
        }

        k =  k % (int)sum;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k = k - chalk[i];

        }
        return 0;
    }
}
