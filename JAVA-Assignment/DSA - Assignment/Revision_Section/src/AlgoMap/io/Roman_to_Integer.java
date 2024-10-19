package AlgoMap.io;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "LVIII";
        int ans = roman(s);
        System.out.println(ans);

    }
    static int roman(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int curr = romanMap.get(s.charAt(i));

            if (i < n - 1 && curr < romanMap.get(s.charAt(i+1))  ) {
                result -= curr;
            }else {
                result += curr;
            }
        }
        return result;
    }
}
