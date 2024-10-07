// https://leetcode.com/problems/find-missing-and-repeated-values
public class _2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        final var existenceIndicators = new boolean[2500];
        final var n = grid.length;
        var sum = 0;
        var a = 0;

        for (final var row : grid) {
            for (var j = 0; j < n; j++) {
                if (existenceIndicators[row[j] - 1]) {
                    a = row[j];
                } else {
                    existenceIndicators[row[j] - 1] = true;
                    sum += row[j];
                }
            }
        }
        var b = (n * n * (n * n + 1)) / 2 - sum;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        final var solution = new _2965();
        int[] missingAndRepeatedValues = solution.findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}});
        System.out.println(missingAndRepeatedValues[0]);
        System.out.println(missingAndRepeatedValues[1]);
    }
}
