import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
public class _0034 {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int targetStart = -1;
        int targetEnd = -1;

        while (start <= end) {
            int m = (start + end) / 2;
            if (nums[m] == target) {
                targetStart = m;
                end = m - 1;
            } else if (nums[m] > target) {
                end = m - 1;
            } else {
                start = m + 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int m = (start + end) / 2;
            if (nums[m] == target) {
                targetEnd = m;
                start = m + 1;
            } else if (nums[m] < target) {
                start = m + 1;
            } else {
                end = m - 1;
            }
        }

        return new int[]{targetStart, targetEnd};
    }

    public static void main(String[] args) {
        final var solution = new _0034();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{6, 6, 6, 6, 6, 6, 6}, 6)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{}, 6)));
    }
}
