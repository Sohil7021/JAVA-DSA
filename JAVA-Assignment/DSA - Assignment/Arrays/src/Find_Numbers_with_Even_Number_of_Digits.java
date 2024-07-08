public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (checkEven(n)) {
                count++;
            }
        }
        return count;
    }

    static boolean checkEven(int num) {
        int evenDigit = 0;
        while (num != 0) {
            evenDigit++;
            num /= 10;
        }

        return evenDigit % 2 == 0;
    }
}
