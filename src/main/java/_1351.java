// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
public class _1351 {
    public int countNegatives(int[][] grid) {

        int n = grid[0].length;
        int count = 0;

        for (int[] row : grid) {
            int start = 0;
            int end = n - 1;

            while (start <= end) {
                int m = (start + end) / 2;
                if (row[m] >= 0) {
                    start = m + 1;
                } else {
                    end = m - 1;
                }
            }

            count += (n - start);
        }
        return count;
    }

    public static void main(String[] args) {
        final var solution = new _1351();
        System.out.println(solution.countNegatives(new int[][]{
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        }));
        System.out.println(solution.countNegatives(new int[][]{
                {3, 1},
                {3, 0}
        }));
    }
}
