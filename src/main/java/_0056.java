// https://leetcode.com/problems/merge-intervals/description/

import java.util.ArrayList;
import java.util.Arrays;

public class _0056 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        final var result = new ArrayList<int[]>();

        for (int i = 0; i < intervals.length; i ++) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < intervals[i][0]) {
                result.add(intervals[i]);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[i][1]);
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        
    }

}
