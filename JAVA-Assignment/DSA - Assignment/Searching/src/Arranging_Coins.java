public class Arranging_Coins {
    public static void main(String[] args) {
        int ans = arrangeCoins(5);
        System.out.println(ans);

    }

   static int arrangeCoins(int n) {
//        Brute Force Approach
//        int count = 0;
//        int row = 1;
//
//        while(n >= row) {
//            n-= row;
//            count++;
//            row++;
//        }
//        return count;

//       Binary Search
       if (n < 1) {
           return 0;
       }

       long start = 0;
       long end = n;

       while (start <= end) {
           long mid = start + (end - start) / 2;
           long curr = mid * (mid + 1) / 2;
           if(curr == n) {
               return (int) mid;
           } else if (curr < n) {
               start = mid + 1;
           }else {
               end = mid - 1;
           }
       }
       return (int) end;

    }
}
