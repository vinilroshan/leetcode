// https://leetcode.com/problems/partition-array-according-to-given-pivot

import java.util.Arrays;

public class _2161 {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] result = new int[nums.length];
        int a = 0;
        int b = nums.length - 1;

        for (int num : nums) {
            if (num < pivot) {
                result[a++] = num;
            }
        }

        for (int i = nums.length - 1; i >= 0; i --) {
            if (nums[i] > pivot) {
                result[b--] = nums[i];
            }
        }

        for (; a <= b; a ++) {
            result[a] = pivot;
        }

        return result;
    }

    public static void main(String[] args) {
        final var solution = new _2161();
        Arrays
                .stream(solution.pivotArray(new int[] { 10, 10, 9, 12, 3, 5, 14, 3, 10 }, 10))
                .forEach(System.out::println);
    }
}
