package Leetcode;

public class Sum_of_Digits_of_String_After_Convert {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = getLucky(s,2);
        System.out.println(ans);


    }
    static int getLucky(String s, int k) {
        int currentNumber = 0;
        for(char ch : s.toCharArray()) {
            int position = ch - 'a' + 1;
            while (position > 0) {
                currentNumber += position % 10;
                position /= 10;
            }
        }

        for (int i = 1; i < k ; i++) {
            int digitSum = 0;
            while (currentNumber > 0) {
                digitSum += currentNumber % 10;
                currentNumber /= 10;
            }
            currentNumber = digitSum;
        }
        return currentNumber;
    }
}
