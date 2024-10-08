import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/third-maximum-number/description
public class _0414 {
    public int thirdMax(int[] nums) {
        final var numSet = new HashSet<Integer>();
        for (final var num : nums) {
            numSet.add(num);
        }

        var index = 0;
        final var uniqueNums = new int[numSet.size()];
        for (final var num : numSet) {
            uniqueNums[index++] = num;
        }
        Arrays.sort(uniqueNums);
        return uniqueNums[uniqueNums.length >= 3 ? uniqueNums.length - 3 : uniqueNums.length - 1];
    }

    public int thirdMax2(int[] nums) {

        final var numSet = new HashSet<Integer>();
        for (final var num : nums) {
            numSet.add(num);
        }

        var index = 0;
        final var uniqueNums = new int[numSet.size()];
        for (final var num : numSet) {
            uniqueNums[index++] = num;
        }

        if (uniqueNums.length == 1) {
            return uniqueNums[0];
        } else if (uniqueNums.length == 2) {
            return Math.max(uniqueNums[0], uniqueNums[1]);
        } else {

            var a = Integer.MIN_VALUE;
            var b = Integer.MIN_VALUE;
            var c = Integer.MIN_VALUE;

            for (int uniqueNum : uniqueNums) {
                if (uniqueNum > a) {
                    c = b;
                    b = a;
                    a = uniqueNum;
                } else if (uniqueNum > b) {
                    c = b;
                    b = uniqueNum;
                } else if (uniqueNum > c) {
                    c = uniqueNum;
                }
            }

            return c;
        }
    }

    public static void main(String[] args) {
        final var solution = new _0414();
        System.out.println(solution.thirdMax2(new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE + 1}));
    }
}
