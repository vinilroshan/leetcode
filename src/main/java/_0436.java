import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class _0436 {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }

        for (int i = 0; i < intervals.length; i++) {
            final var entry = map.ceilingEntry(intervals[i][1]);
            if (entry == null) {
                result[i] = -1;
            } else {
                result[i] = entry.getValue();
            }
        }

        return result;
    }

    public int[] findRightInterval1(int[][] intervals) {
        int length = intervals.length;
        int[] result = new int[length];
        int[][] intervalsNew = new int[length][3];

        for (int i = 0; i < length; i++) {
            intervalsNew[i] = new int[]{intervals[i][0], intervals[i][1], i};
        }

        Arrays.sort(intervalsNew, Comparator.comparingInt(i -> i[0]));

        for (int i = 0; i < length; i++) {
            int start = 0;
            int end = length - 1;
            int[] interval = intervals[i];

            int index = -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (intervalsNew[mid][0] >= interval[1]) {
                    index = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            result[i] = (index == -1) ? index : intervalsNew[index][2];
        }

        return result;
    }

    public static void main(String[] args) {
        _0436 solution = new _0436();
        System.out.println(Arrays.toString(solution.findRightInterval1(new int[][]{
                {3, 4}, {2, 3}, {1, 2}
        })));
        System.out.println(Arrays.toString(solution.findRightInterval1(new int[][]{
                {1, 4}, {2, 3}, {3, 4}
        })));
    }
}
