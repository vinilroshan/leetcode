import java.util.HashMap;

// https://leetcode.com/problems/degree-of-an-array/description
public class _0697 {
    public int findShortestSubArray(int[] nums) {
        final var counterMap = new HashMap<Integer, int[]>();

        for (var i = 0; i < nums.length; i ++) {
            if (!counterMap.containsKey(nums[i])) {
                counterMap.put(nums[i], new int[] {1, i, i});
            } else {
                final var tracker = counterMap.get(nums[i]);
                tracker[0] += 1;
                tracker[2] = i;
            }
        }

        var degree = -1;

        for (final var entry: counterMap.entrySet()) {
            final var tracker = entry.getValue();
            if (degree < tracker[0]) {
                degree = tracker[0];
            }
        }

        var minSubArray = Integer.MAX_VALUE;
        for (final var entry: counterMap.entrySet()) {
            final var tracker = entry.getValue();
            int subArrayLength = tracker[2] - tracker[1] + 1;
            if (tracker[0] == degree && minSubArray > subArrayLength) {
                minSubArray = subArrayLength;
            }
        }

        return minSubArray;
    }

    public static void main(String[] args) {
        final var solution = new _0697();
        System.out.println(solution.findShortestSubArray(new int[] {1,2,2,3,1}));
        System.out.println(solution.findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
        System.out.println(solution.findShortestSubArray(new int[] {1,2,2,3,1}));
    }
}
