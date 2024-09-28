package Interview_Master_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}

        };
        int[][] ans = merge(intervals);
        for (int[] n : ans) {
            System.out.print(Arrays.toString(n));
        }

    }
    static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Sort the intervals by the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Create a list to hold the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Start with the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            // If the current interval overlaps with the next one, merge them
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                // Otherwise, move to the next interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Convert the list of merged intervals back into a 2D array
        return merged.toArray(new int[merged.size()][]);

    }
}
